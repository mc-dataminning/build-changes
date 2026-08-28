import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvd extends bum implements bug, bwg {
   private static final Logger a = LogUtils.getLogger();
   private static final ajy<Float> b = akc.a(bvd.class, aka.d);
   private static final ajy<Float> c = akc.a(bvd.class, aka.d);
   private static final ajy<Boolean> d = akc.a(bvd.class, aka.k);
   private static final String e = "width";
   private static final String f = "height";
   private static final String g = "attack";
   private static final String h = "interaction";
   private static final String i = "response";
   @Nullable
   private bvd.a j;
   @Nullable
   private bvd.a k;

   public bvd(but<?> $$0, dgj $$1) {
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
         bvd.a.a.decode(ue.a, $$0.c("attack")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.j = (bvd.a)$$0x.getFirst());
      } else {
         this.j = null;
      }

      if ($$0.e("interaction")) {
         bvd.a.a.decode(ue.a, $$0.c("interaction")).resultOrPartial(af.a("Interaction entity", a::error)).ifPresent($$0x -> this.k = (bvd.a)$$0x.getFirst());
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
         bvd.a.a.encodeStart(ue.a, this.j).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.k != null) {
         bvd.a.a.encodeStart(ue.a, this.k).ifSuccess($$1 -> $$0.a("interaction", $$1));
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
   public etf n_() {
      return etf.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public boolean v(bum $$0) {
      if ($$0 instanceof coy $$1) {
         this.j = new bvd.a($$1.cG(), this.dV().ad());
         if ($$1 instanceof are $$2) {
            ap.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.s();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(ard $$0, btc $$1, float $$2) {
      return false;
   }

   @Override
   public bsl a(coy $$0, bsk $$1) {
      if (this.dV().C) {
         return this.s() ? bsl.a : bsl.c;
      } else {
         this.k = new bvd.a($$0.cG(), this.dV().ad());
         return bsl.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bvi am() {
      return this.j != null ? this.dV().b(this.j.a()) : null;
   }

   @Nullable
   @Override
   public bvi O_() {
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

   private bup t() {
      return bup.b(this.m(), this.p());
   }

   @Override
   public bup a(bvu $$0) {
      return this.t();
   }

   @Override
   protected faw c(fbb $$0) {
      return this.t().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bvd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kl.a.fieldOf("player").forGetter(bvd.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bvd.a::b)).apply($$0, bvd.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
