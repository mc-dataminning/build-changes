import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bir extends big implements bie, bjt {
   private static final Logger b = LogUtils.getLogger();
   private static final adx<Float> c = aea.a(bir.class, adz.d);
   private static final adx<Float> d = aea.a(bir.class, adz.d);
   private static final adx<Boolean> e = aea.a(bir.class, adz.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bir.a k;
   @Nullable
   private bir.a l;

   public bir(bik<?> $$0, cpk $$1) {
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
   protected void a(qs $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bir.a.a.decode(rd.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bir.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bir.a.a.decode(rd.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bir.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.ao());
   }

   @Override
   protected void b(qs $$0) {
      $$0.a("width", this.m());
      $$0.a("height", this.o());
      if (this.k != null) {
         bir.a.a.encodeStart(rd.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bir.a.a.encodeStart(rd.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.p());
   }

   @Override
   public void a(adx<?> $$0) {
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
   public eag l_() {
      return eag.d;
   }

   @Override
   public boolean d_() {
      return true;
   }

   @Override
   public boolean u(big $$0) {
      if ($$0 instanceof cbl $$1) {
         this.k = new bir.a($$1.cv(), this.dK().V());
         if ($$1 instanceof akj $$2) {
            ai.g.a($$2, this, $$1.dL().n(), 1.0F, 1.0F, false);
         }

         return !this.p();
      } else {
         return false;
      }
   }

   @Override
   public bgo a(cbl $$0, bgn $$1) {
      if (this.dK().B) {
         return this.p() ? bgo.a : bgo.b;
      } else {
         this.l = new bir.a($$0.cv(), this.dK().V());
         return bgo.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public biw M_() {
      return this.k != null ? this.dK().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public biw j() {
      return this.l != null ? this.dK().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.an.b(c, $$0);
   }

   private float m() {
      return this.an.b(c);
   }

   private void b(float $$0) {
      this.an.b(d, $$0);
   }

   private float o() {
      return this.an.b(d);
   }

   private void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   private boolean p() {
      return this.an.b(e);
   }

   private bih q() {
      return bih.b(this.m(), this.o());
   }

   @Override
   public bih a(bji $$0) {
      return this.q();
   }

   @Override
   protected eha ao() {
      return this.q().a(this.di());
   }

   static record a(UUID b, long c) {
      public static final Codec<bir.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(hz.a.fieldOf("player").forGetter(bir.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bir.a::b)).apply($$0, bir.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
