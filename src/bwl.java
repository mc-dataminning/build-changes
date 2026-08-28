import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bwl extends bvs implements bvl, bxo {
   private static final Logger a = LogUtils.getLogger();
   private static final akg<Float> b = akk.a(bwl.class, aki.d);
   private static final akg<Float> c = akk.a(bwl.class, aki.d);
   private static final akg<Boolean> d = akk.a(bwl.class, aki.k);
   private static final String e = "width";
   private static final String f = "height";
   private static final String g = "attack";
   private static final String h = "interaction";
   private static final String i = "response";
   @Nullable
   private bwl.a j;
   @Nullable
   private bwl.a k;

   public bwl(bwb<?> $$0, dhp $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(b, 1.0F);
      $$0.a(c, 1.0F);
      $$0.a(d, false);
   }

   @Override
   protected void a(tw $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bwl.a.a.decode(uk.a, $$0.c("attack")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.j = (bwl.a)$$0x.getFirst());
      } else {
         this.j = null;
      }

      if ($$0.e("interaction")) {
         bwl.a.a.decode(uk.a, $$0.c("interaction")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.k = (bwl.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      this.a($$0.q("response"));
      this.a(this.ax());
   }

   @Override
   protected void b(tw $$0) {
      $$0.a("width", this.g());
      $$0.a("height", this.j());
      if (this.j != null) {
         bwl.a.a.encodeStart(uk.a, this.j).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.k != null) {
         bwl.a.a.encodeStart(uk.a, this.k).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.m());
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (c.equals($$0) || b.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public euy j_() {
      return euy.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean v(bvs $$0) {
      if ($$0 instanceof cqi $$1) {
         this.j = new bwl.a($$1.cG(), this.dV().ae());
         if ($$1 instanceof aro $$2) {
            ap.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.m();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(arn $$0, buh $$1, float $$2) {
      return false;
   }

   @Override
   public btq a(cqi $$0, btp $$1) {
      if (this.dV().C) {
         return this.m() ? btq.a : btq.c;
      } else {
         this.k = new bwl.a($$0.cG(), this.dV().ae());
         return btq.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bwr am() {
      return this.j != null ? this.dV().a(this.j.a()) : null;
   }

   @Nullable
   @Override
   public bwr f() {
      return this.k != null ? this.dV().a(this.k.a()) : null;
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

   private bvv n() {
      return bvv.b(this.g(), this.j());
   }

   @Override
   public bvv a(bxd $$0) {
      return this.n();
   }

   @Override
   protected fcp c(fcu $$0) {
      return this.n().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bwl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(km.a.fieldOf("player").forGetter(bwl.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bwl.a::b)).apply($$0, bwl.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
