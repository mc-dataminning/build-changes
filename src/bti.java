import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bti extends bss implements bsp, bul {
   private static final Logger b = LogUtils.getLogger();
   private static final akj<Float> c = akn.a(bti.class, akl.d);
   private static final akj<Float> d = akn.a(bti.class, akl.d);
   private static final akj<Boolean> e = akn.a(bti.class, akl.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bti.a k;
   @Nullable
   private bti.a l;

   public bti(bsy<?> $$0, dbw $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(ur $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bti.a.a.decode(vf.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bti.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bti.a.a.decode(vf.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bti.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.as());
   }

   @Override
   protected void b(ur $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         bti.a.a.encodeStart(vf.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bti.a.a.encodeStart(vf.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.as());
      }
   }

   @Override
   public boolean by() {
      return false;
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public eny k_() {
      return eny.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bss $$0) {
      if ($$0 instanceof cmv $$1) {
         this.k = new bti.a($$1.cz(), this.dP().Z());
         if ($$1 instanceof arf $$2) {
            am.h.a($$2, this, $$1.dQ().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bqs a(cmv $$0, bqr $$1) {
      if (this.dP().B) {
         return this.v() ? bqs.a : bqs.c;
      } else {
         this.l = new bti.a($$0.cz(), this.dP().Z());
         return bqs.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public btn T_() {
      return this.k != null ? this.dP().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public btn p() {
      return this.l != null ? this.dP().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.ao.a(c, $$0);
   }

   private float s() {
      return this.ao.a(c);
   }

   private void b(float $$0) {
      this.ao.a(d, $$0);
   }

   private float u() {
      return this.ao.a(d);
   }

   private void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   private boolean v() {
      return this.ao.a(e);
   }

   private bsv w() {
      return bsv.b(this.s(), this.u());
   }

   @Override
   public bsv a(btz $$0) {
      return this.w();
   }

   @Override
   protected evk as() {
      return this.w().a(this.dn());
   }

   static record a(UUID b, long c) {
      public static final Codec<bti.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kc.a.fieldOf("player").forGetter(bti.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bti.a::b)).apply($$0, bti.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
