import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvc extends bul implements buf, bwf {
   private static final Logger a = LogUtils.getLogger();
   private static final ajy<Float> b = akc.a(bvc.class, aka.d);
   private static final ajy<Float> c = akc.a(bvc.class, aka.d);
   private static final ajy<Boolean> d = akc.a(bvc.class, aka.k);
   private static final String e = "width";
   private static final String f = "height";
   private static final String g = "attack";
   private static final String h = "interaction";
   private static final String i = "response";
   @Nullable
   private bvc.a j;
   @Nullable
   private bvc.a k;

   public bvc(bus<?> $$0, dgi $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(akc.a $$0) {
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
         bvc.a.a.decode(ue.a, $$0.c("attack")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.j = (bvc.a)$$0x.getFirst());
      } else {
         this.j = null;
      }

      if ($$0.e("interaction")) {
         bvc.a.a.decode(ue.a, $$0.c("interaction")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.k = (bvc.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      this.a($$0.q("response"));
      this.a(this.ax());
   }

   @Override
   protected void b(tq $$0) {
      $$0.a("width", this.m());
      $$0.a("height", this.p());
      if (this.j != null) {
         bvc.a.a.encodeStart(ue.a, this.j).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.k != null) {
         bvc.a.a.encodeStart(ue.a, this.k).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.s());
   }

   @Override
   public void a(ajy<?> $$0) {
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
   public ete n_() {
      return ete.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public boolean v(bul $$0) {
      if ($$0 instanceof cox $$1) {
         this.j = new bvc.a($$1.cG(), this.dV().ad());
         if ($$1 instanceof are $$2) {
            ap.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.s();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(ard $$0, btb $$1, float $$2) {
      return false;
   }

   @Override
   public bsk a(cox $$0, bsj $$1) {
      if (this.dV().C) {
         return this.s() ? bsk.a : bsk.c;
      } else {
         this.k = new bvc.a($$0.cG(), this.dV().ad());
         return bsk.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bvh am() {
      return this.j != null ? this.dV().b(this.j.a()) : null;
   }

   @Nullable
   @Override
   public bvh O_() {
      return this.k != null ? this.dV().b(this.k.a()) : null;
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

   private buo t() {
      return buo.b(this.m(), this.p());
   }

   @Override
   public buo a(bvt $$0) {
      return this.t();
   }

   @Override
   protected fav c(fba $$0) {
      return this.t().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bvc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kl.a.fieldOf("player").forGetter(bvc.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bvc.a::b)).apply($$0, bvc.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
