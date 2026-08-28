import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvs extends bvb implements buv, bwv {
   private static final Logger a = LogUtils.getLogger();
   private static final aks<Float> b = akw.a(bvs.class, aku.d);
   private static final aks<Float> c = akw.a(bvs.class, aku.d);
   private static final aks<Boolean> d = akw.a(bvs.class, aku.k);
   private static final String e = "width";
   private static final String f = "height";
   private static final String g = "attack";
   private static final String h = "interaction";
   private static final String i = "response";
   @Nullable
   private bvs.a j;
   @Nullable
   private bvs.a k;

   public bvs(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(akw.a $$0) {
      $$0.a(b, 1.0F);
      $$0.a(c, 1.0F);
      $$0.a(d, false);
   }

   @Override
   protected void a(um $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bvs.a.a.decode(va.a, $$0.c("attack")).resultOrPartial(ae.a("Interaction entity", a::error)).ifPresent($$0x -> this.j = (bvs.a)$$0x.getFirst());
      } else {
         this.j = null;
      }

      if ($$0.e("interaction")) {
         bvs.a.a.decode(va.a, $$0.c("interaction")).resultOrPartial(ae.a("Interaction entity", a::error)).ifPresent($$0x -> this.k = (bvs.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      this.a($$0.q("response"));
      this.a(this.ax());
   }

   @Override
   protected void b(um $$0) {
      $$0.a("width", this.m());
      $$0.a("height", this.p());
      if (this.j != null) {
         bvs.a.a.encodeStart(va.a, this.j).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.k != null) {
         bvs.a.a.encodeStart(va.a, this.k).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.s());
   }

   @Override
   public void a(aks<?> $$0) {
      super.a($$0);
      if (c.equals($$0) || b.equals($$0)) {
         this.m_();
      }
   }

   @Override
   public boolean bG() {
      return false;
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public etv n_() {
      return etv.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public boolean v(bvb $$0) {
      if ($$0 instanceof cpo $$1) {
         this.j = new bvs.a($$1.cG(), this.dW().ad());
         if ($$1 instanceof ary $$2) {
            ao.h.a($$2, this, $$1.dX().p(), 1.0F, 1.0F, false);
         }

         return !this.s();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(arx $$0, btr $$1, float $$2) {
      return false;
   }

   @Override
   public bta a(cpo $$0, bsz $$1) {
      if (this.dW().C) {
         return this.s() ? bta.a : bta.c;
      } else {
         this.k = new bvs.a($$0.cG(), this.dW().ad());
         return bta.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bvx am() {
      return this.j != null ? this.dW().b(this.j.a()) : null;
   }

   @Nullable
   @Override
   public bvx O_() {
      return this.k != null ? this.dW().b(this.k.a()) : null;
   }

   private void a(float $$0) {
      this.al.a(b, $$0);
   }

   private float m() {
      return this.al.a(b);
   }

   private void b(float $$0) {
      this.al.a(c, $$0);
   }

   private float p() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.al.a(d, $$0);
   }

   private boolean s() {
      return this.al.a(d);
   }

   private bve t() {
      return bve.b(this.m(), this.p());
   }

   @Override
   public bve a(bwj $$0) {
      return this.t();
   }

   @Override
   protected fbm ax() {
      return this.t().a(this.du());
   }

   static record a(UUID b, long c) {
      public static final Codec<bvs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kk.a.fieldOf("player").forGetter(bvs.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bvs.a::b)).apply($$0, bvs.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
