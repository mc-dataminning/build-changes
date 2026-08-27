import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bma extends blp implements bln, bnb {
   private static final Logger b = LogUtils.getLogger();
   private static final agj<Float> c = agm.a(bma.class, agl.d);
   private static final agj<Float> d = agm.a(bma.class, agl.d);
   private static final agj<Boolean> e = agm.a(bma.class, agl.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bma.a k;
   @Nullable
   private bma.a l;

   public bma(blt<?> $$0, cti $$1) {
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
   protected void a(sl $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bma.a.a.decode(sz.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bma.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bma.a.a.decode(sz.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bma.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(sl $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         bma.a.a.encodeStart(sz.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bma.a.a.encodeStart(sz.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.w());
   }

   @Override
   public void a(agj<?> $$0) {
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
   public eep s_() {
      return eep.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(blp $$0) {
      if ($$0 instanceof cfb $$1) {
         this.k = new bma.a($$1.cw(), this.dM().X());
         if ($$1 instanceof ana $$2) {
            am.h.a($$2, this, $$1.dN().n(), 1.0F, 1.0F, false);
         }

         return !this.w();
      } else {
         return false;
      }
   }

   @Override
   public bjv a(cfb $$0, bju $$1) {
      if (this.dM().B) {
         return this.w() ? bjv.a : bjv.b;
      } else {
         this.l = new bma.a($$0.cw(), this.dM().X());
         return bjv.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bmf V_() {
      return this.k != null ? this.dM().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bmf q() {
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

   private blq x() {
      return blq.b(this.s(), this.u());
   }

   @Override
   public blq a(bmr $$0) {
      return this.x();
   }

   @Override
   protected elh aq() {
      return this.x().a(this.dk());
   }

   static record a(UUID b, long c) {
      public static final Codec<bma.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ja.a.fieldOf("player").forGetter(bma.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bma.a::b)).apply($$0, bma.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
