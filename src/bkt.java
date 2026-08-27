import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bkt extends bki implements bkg, blu {
   private static final Logger b = LogUtils.getLogger();
   private static final afm<Float> c = afp.a(bkt.class, afo.d);
   private static final afm<Float> d = afp.a(bkt.class, afo.d);
   private static final afm<Boolean> e = afp.a(bkt.class, afo.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bkt.a k;
   @Nullable
   private bkt.a l;

   public bkt(bkm<?> $$0, crs $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void b_() {
      this.an.a(c, 1.0F);
      this.an.a(d, 1.0F);
      this.an.a(e, false);
   }

   @Override
   protected void a(rz $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bkt.a.a.decode(sn.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bkt.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bkt.a.a.decode(sn.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bkt.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.ao());
   }

   @Override
   protected void b(rz $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.t());
      if (this.k != null) {
         bkt.a.a.encodeStart(sn.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bkt.a.a.encodeStart(sn.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(afm<?> $$0) {
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
   public ecl r_() {
      return ecl.d;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean u(bki $$0) {
      if ($$0 instanceof cdm $$1) {
         this.k = new bkt.a($$1.cv(), this.dL().V());
         if ($$1 instanceof amb $$2) {
            al.g.a($$2, this, $$1.dM().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public biq a(cdm $$0, bip $$1) {
      if (this.dL().B) {
         return this.v() ? biq.a : biq.b;
      } else {
         this.l = new bkt.a($$0.cv(), this.dL().V());
         return biq.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bky T_() {
      return this.k != null ? this.dL().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bky q() {
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

   private bkj w() {
      return bkj.b(this.s(), this.t());
   }

   @Override
   public bkj a(blk $$0) {
      return this.w();
   }

   @Override
   protected ejd ao() {
      return this.w().a(this.dj());
   }

   static record a(UUID b, long c) {
      public static final Codec<bkt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iv.a.fieldOf("player").forGetter(bkt.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bkt.a::b)).apply($$0, bkt.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
