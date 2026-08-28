import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvs extends bva implements but, bww {
   private static final Logger a = LogUtils.getLogger();
   private static final ajx<Float> b = akb.a(bvs.class, ajz.d);
   private static final ajx<Float> c = akb.a(bvs.class, ajz.d);
   private static final ajx<Boolean> d = akb.a(bvs.class, ajz.k);
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
   protected void a(akb.a $$0) {
      $$0.a(b, 1.0F);
      $$0.a(c, 1.0F);
      $$0.a(d, false);
   }

   @Override
   protected void a(tq $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bvs.a.a.decode(ue.a, $$0.c("attack")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.j = (bvs.a)$$0x.getFirst());
      } else {
         this.j = null;
      }

      if ($$0.e("interaction")) {
         bvs.a.a.decode(ue.a, $$0.c("interaction")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.k = (bvs.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      this.a($$0.q("response"));
      this.a(this.ax());
   }

   @Override
   protected void b(tq $$0) {
      $$0.a("width", this.g());
      $$0.a("height", this.j());
      if (this.j != null) {
         bvs.a.a.encodeStart(ue.a, this.j).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.k != null) {
         bvs.a.a.encodeStart(ue.a, this.k).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.m());
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (c.equals($$0) || b.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public boolean bE() {
      return false;
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public eub j_() {
      return eub.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean v(bva $$0) {
      if ($$0 instanceof cpr $$1) {
         this.j = new bvs.a($$1.cF(), this.dU().ae());
         if ($$1 instanceof are $$2) {
            ap.h.a($$2, this, $$1.dV().p(), 1.0F, 1.0F, false);
         }

         return !this.m();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      return false;
   }

   @Override
   public bsy a(cpr $$0, bsx $$1) {
      if (this.dU().C) {
         return this.m() ? bsy.a : bsy.c;
      } else {
         this.k = new bvs.a($$0.cF(), this.dU().ae());
         return bsy.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bvy am() {
      return this.j != null ? this.dU().a(this.j.a()) : null;
   }

   @Nullable
   @Override
   public bvy f() {
      return this.k != null ? this.dU().a(this.k.a()) : null;
   }

   private void a(float $$0) {
      this.al.a(b, $$0);
   }

   private float g() {
      return this.al.a(b);
   }

   private void b(float $$0) {
      this.al.a(c, $$0);
   }

   private float j() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.al.a(d, $$0);
   }

   private boolean m() {
      return this.al.a(d);
   }

   private bvd n() {
      return bvd.b(this.g(), this.j());
   }

   @Override
   public bvd a(bwk $$0) {
      return this.n();
   }

   @Override
   protected fbs c(fbx $$0) {
      return this.n().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bvs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kl.a.fieldOf("player").forGetter(bvs.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bvs.a::b)).apply($$0, bvs.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
