import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bsj extends brv implements brs, btl {
   private static final Logger b = LogUtils.getLogger();
   private static final ajy<Float> c = akc.a(bsj.class, aka.d);
   private static final ajy<Float> d = akc.a(bsj.class, aka.d);
   private static final ajy<Boolean> e = akc.a(bsj.class, aka.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bsj.a k;
   @Nullable
   private bsj.a l;

   public bsj(bsb<?> $$0, dca $$1) {
      super($$0, $$1);
      this.ah = true;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(uk $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bsj.a.a.decode(uy.a, $$0.c("attack")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bsj.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bsj.a.a.decode(uy.a, $$0.c("interaction")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bsj.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.as());
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("width", this.r());
      $$0.a("height", this.t());
      if (this.k != null) {
         bsj.a.a.encodeStart(uy.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bsj.a.a.encodeStart(uy.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.u());
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.as());
      }
   }

   @Override
   public boolean bD() {
      return false;
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public epj j_() {
      return epj.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(brv $$0) {
      if ($$0 instanceof cly $$1) {
         this.k = new bsj.a($$1.cE(), this.dU().Z());
         if ($$1 instanceof aqu $$2) {
            an.h.a($$2, this, $$1.dX().o(), 1.0F, 1.0F, false);
         }

         return !this.u();
      } else {
         return false;
      }
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      if (this.dU().C) {
         return this.u() ? bqa.a : bqa.b;
      } else {
         this.l = new bsj.a($$0.cE(), this.dU().Z());
         return bqa.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bso U_() {
      return this.k != null ? this.dU().c(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bso p() {
      return this.l != null ? this.dU().c(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.as.a(c, $$0);
   }

   private float r() {
      return this.as.a(c);
   }

   private void b(float $$0) {
      this.as.a(d, $$0);
   }

   private float t() {
      return this.as.a(d);
   }

   private void a(boolean $$0) {
      this.as.a(e, $$0);
   }

   private boolean u() {
      return this.as.a(e);
   }

   private bry w() {
      return bry.b(this.r(), this.t());
   }

   @Override
   public bry a(bsz $$0) {
      return this.w();
   }

   @Override
   protected ewp as() {
      return this.w().a(this.ds());
   }

   static record a(UUID b, long c) {
      public static final Codec<bsj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ju.a.fieldOf("player").forGetter(bsj.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bsj.a::b)).apply($$0, bsj.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
