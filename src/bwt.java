import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bwt extends bwa implements bvt, bxw {
   private static final Logger a = LogUtils.getLogger();
   private static final akh<Float> b = akl.a(bwt.class, akj.d);
   private static final akh<Float> c = akl.a(bwt.class, akj.d);
   private static final akh<Boolean> d = akl.a(bwt.class, akj.k);
   private static final String e = "width";
   private static final String f = "height";
   private static final String g = "attack";
   private static final String h = "interaction";
   private static final String i = "response";
   @Nullable
   private bwt.a j;
   @Nullable
   private bwt.a k;

   public bwt(bwj<?> $$0, dip $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(b, 1.0F);
      $$0.a(c, 1.0F);
      $$0.a(d, false);
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bwt.a.a.decode(ul.a, $$0.c("attack")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.j = (bwt.a)$$0x.getFirst());
      } else {
         this.j = null;
      }

      if ($$0.e("interaction")) {
         bwt.a.a.decode(ul.a, $$0.c("interaction")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.k = (bwt.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      this.a($$0.q("response"));
      this.a(this.ax());
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("width", this.g());
      $$0.a("height", this.j());
      if (this.j != null) {
         bwt.a.a.encodeStart(ul.a, this.j).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.k != null) {
         bwt.a.a.encodeStart(ul.a, this.k).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.m());
   }

   @Override
   public void a(akh<?> $$0) {
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
   public ewa j_() {
      return ewa.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean v(bwa $$0) {
      if ($$0 instanceof cqs $$1) {
         this.j = new bwt.a($$1.cG(), this.dV().ae());
         if ($$1 instanceof arp $$2) {
            ap.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.m();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(aro $$0, bup $$1, float $$2) {
      return false;
   }

   @Override
   public bty a(cqs $$0, btx $$1) {
      if (this.dV().C) {
         return this.m() ? bty.a : bty.c;
      } else {
         this.k = new bwt.a($$0.cG(), this.dV().ae());
         return bty.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bwz am() {
      return this.j != null ? this.dV().a(this.j.a()) : null;
   }

   @Nullable
   @Override
   public bwz f() {
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

   private bwd n() {
      return bwd.b(this.g(), this.j());
   }

   @Override
   public bwd a(bxl $$0) {
      return this.n();
   }

   @Override
   protected fdr c(fdw $$0) {
      return this.n().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bwt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jy.a.fieldOf("player").forGetter(bwt.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bwt.a::b)).apply($$0, bwt.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
