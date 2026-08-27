import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bjd extends bis implements biq, bke {
   private static final Logger b = LogUtils.getLogger();
   private static final aeg<Float> c = aej.a(bjd.class, aei.d);
   private static final aeg<Float> d = aej.a(bjd.class, aei.d);
   private static final aeg<Boolean> e = aej.a(bjd.class, aei.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bjd.a k;
   @Nullable
   private bjd.a l;

   public bjd(biw<?> $$0, cpx $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void a_() {
      this.an.a(c, 1.0F);
      this.an.a(d, 1.0F);
      this.an.a(e, false);
   }

   @Override
   protected void a(qy $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bjd.a.a.decode(rk.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bjd.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bjd.a.a.decode(rk.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bjd.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.ao());
   }

   @Override
   protected void b(qy $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.t());
      if (this.k != null) {
         bjd.a.a.encodeStart(rk.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bjd.a.a.encodeStart(rk.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(aeg<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.ao());
      }
   }

   @Override
   public boolean bq() {
      return false;
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public eat q_() {
      return eat.d;
   }

   @Override
   public boolean p_() {
      return true;
   }

   @Override
   public boolean u(bis $$0) {
      if ($$0 instanceof cbw $$1) {
         this.k = new bjd.a($$1.cv(), this.dL().V());
         if ($$1 instanceof akt $$2) {
            al.g.a($$2, this, $$1.dM().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bha a(cbw $$0, bgz $$1) {
      if (this.dL().B) {
         return this.v() ? bha.a : bha.b;
      } else {
         this.l = new bjd.a($$0.cv(), this.dL().V());
         return bha.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bji S_() {
      return this.k != null ? this.dL().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bji q() {
      return this.l != null ? this.dL().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.an.b(c, $$0);
   }

   private float s() {
      return this.an.b(c);
   }

   private void b(float $$0) {
      this.an.b(d, $$0);
   }

   private float t() {
      return this.an.b(d);
   }

   private void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   private boolean v() {
      return this.an.b(e);
   }

   private bit w() {
      return bit.b(this.s(), this.t());
   }

   @Override
   public bit a(bju $$0) {
      return this.w();
   }

   @Override
   protected ehk ao() {
      return this.w().a(this.dj());
   }

   static record a(UUID b, long c) {
      public static final Codec<bjd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ia.a.fieldOf("player").forGetter(bjd.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bjd.a::b)).apply($$0, bjd.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
