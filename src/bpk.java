import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bpk extends box implements bov, bqm {
   private static final Logger b = LogUtils.getLogger();
   private static final aim<Float> c = aiq.a(bpk.class, aio.d);
   private static final aim<Float> d = aiq.a(bpk.class, aio.d);
   private static final aim<Boolean> e = aiq.a(bpk.class, aio.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bpk.a k;
   @Nullable
   private bpk.a l;

   public bpk(bpd<?> $$0, cxb $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(ta $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bpk.a.a.decode(to.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bpk.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bpk.a.a.decode(to.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bpk.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(ta $$0) {
      $$0.a("width", this.r());
      $$0.a("height", this.s());
      if (this.k != null) {
         bpk.a.a.encodeStart(to.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bpk.a.a.encodeStart(to.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(aim<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.aq());
      }
   }

   @Override
   public boolean bv() {
      return false;
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Override
   public eiu r_() {
      return eiu.d;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean u(box $$0) {
      if ($$0 instanceof ciu $$1) {
         this.k = new bpk.a($$1.cw(), this.dM().X());
         if ($$1 instanceof apg $$2) {
            am.h.a($$2, this, $$1.dN().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bnd a(ciu $$0, bnc $$1) {
      if (this.dM().B) {
         return this.v() ? bnd.a : bnd.b;
      } else {
         this.l = new bpk.a($$0.cw(), this.dM().X());
         return bnd.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bpp T_() {
      return this.k != null ? this.dM().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bpp p() {
      return this.l != null ? this.dM().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.an.a(c, $$0);
   }

   private float r() {
      return this.an.a(c);
   }

   private void b(float $$0) {
      this.an.a(d, $$0);
   }

   private float s() {
      return this.an.a(d);
   }

   private void a(boolean $$0) {
      this.an.a(e, $$0);
   }

   private boolean v() {
      return this.an.a(e);
   }

   private bpa w() {
      return bpa.b(this.r(), this.s());
   }

   @Override
   public bpa a(bqa $$0) {
      return this.w();
   }

   @Override
   protected epo aq() {
      return this.w().a(this.dk());
   }

   static record a(UUID b, long c) {
      public static final Codec<bpk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jf.a.fieldOf("player").forGetter(bpk.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bpk.a::b)).apply($$0, bpk.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
