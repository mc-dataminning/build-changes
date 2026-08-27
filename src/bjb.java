import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bjb extends biq implements bio, bkc {
   private static final Logger b = LogUtils.getLogger();
   private static final aef<Float> c = aei.a(bjb.class, aeh.d);
   private static final aef<Float> d = aei.a(bjb.class, aeh.d);
   private static final aef<Boolean> e = aei.a(bjb.class, aeh.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bjb.a k;
   @Nullable
   private bjb.a l;

   public bjb(biu<?> $$0, cpv $$1) {
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
   protected void a(qx $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bjb.a.a.decode(ri.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bjb.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bjb.a.a.decode(ri.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bjb.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.ap());
   }

   @Override
   protected void b(qx $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.t());
      if (this.k != null) {
         bjb.a.a.encodeStart(ri.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bjb.a.a.encodeStart(ri.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(aef<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.ap());
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   public ear q_() {
      return ear.d;
   }

   @Override
   public boolean p_() {
      return true;
   }

   @Override
   public boolean u(biq $$0) {
      if ($$0 instanceof cbu $$1) {
         this.k = new bjb.a($$1.cw(), this.dL().V());
         if ($$1 instanceof aks $$2) {
            al.g.a($$2, this, $$1.dM().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bgy a(cbu $$0, bgx $$1) {
      if (this.dL().B) {
         return this.v() ? bgy.a : bgy.b;
      } else {
         this.l = new bjb.a($$0.cw(), this.dL().V());
         return bgy.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bjg S_() {
      return this.k != null ? this.dL().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bjg q() {
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

   private bir w() {
      return bir.b(this.s(), this.t());
   }

   @Override
   public bir a(bjs $$0) {
      return this.w();
   }

   @Override
   protected ehi ap() {
      return this.w().a(this.dj());
   }

   static record a(UUID b, long c) {
      public static final Codec<bjb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ia.a.fieldOf("player").forGetter(bjb.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bjb.a::b)).apply($$0, bjb.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
