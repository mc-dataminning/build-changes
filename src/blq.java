import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class blq extends blf implements bld, bmr {
   private static final Logger b = LogUtils.getLogger();
   private static final afz<Float> c = agc.a(blq.class, agb.d);
   private static final afz<Float> d = agc.a(blq.class, agb.d);
   private static final afz<Boolean> e = agc.a(blq.class, agb.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private blq.a k;
   @Nullable
   private blq.a l;

   public blq(blj<?> $$0, csy $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void c_() {
      this.an.a(c, 1.0F);
      this.an.a(d, 1.0F);
      this.an.a(e, false);
   }

   @Override
   protected void a(sj $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         blq.a.a.decode(sx.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (blq.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         blq.a.a.decode(sx.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (blq.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(sj $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         blq.a.a.encodeStart(sx.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         blq.a.a.encodeStart(sx.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.w());
   }

   @Override
   public void a(afz<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.aq());
      }
   }

   @Override
   public boolean bs() {
      return false;
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public eee s_() {
      return eee.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(blf $$0) {
      if ($$0 instanceof cer $$1) {
         this.k = new blq.a($$1.cw(), this.dM().W());
         if ($$1 instanceof amq $$2) {
            am.h.a($$2, this, $$1.dN().n(), 1.0F, 1.0F, false);
         }

         return !this.w();
      } else {
         return false;
      }
   }

   @Override
   public bjl a(cer $$0, bjk $$1) {
      if (this.dM().B) {
         return this.w() ? bjl.a : bjl.b;
      } else {
         this.l = new blq.a($$0.cw(), this.dM().W());
         return bjl.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public blv V_() {
      return this.k != null ? this.dM().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public blv q() {
      return this.l != null ? this.dM().b(this.l.a()) : null;
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

   private float u() {
      return this.an.b(d);
   }

   private void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   private boolean w() {
      return this.an.b(e);
   }

   private blg x() {
      return blg.b(this.s(), this.u());
   }

   @Override
   public blg a(bmh $$0) {
      return this.x();
   }

   @Override
   protected ekw aq() {
      return this.x().a(this.dk());
   }

   static record a(UUID b, long c) {
      public static final Codec<blq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iy.a.fieldOf("player").forGetter(blq.a::a), Codec.LONG.fieldOf("timestamp").forGetter(blq.a::b)).apply($$0, blq.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
