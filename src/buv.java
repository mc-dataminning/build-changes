import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class buv extends bue implements bty, bvy {
   private static final Logger b = LogUtils.getLogger();
   private static final akl<Float> c = akp.a(buv.class, akn.d);
   private static final akl<Float> d = akp.a(buv.class, akn.d);
   private static final akl<Boolean> e = akp.a(buv.class, akn.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private buv.a k;
   @Nullable
   private buv.a l;

   public buv(bul<?> $$0, dfb $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   protected void a(akp.a $$0) {
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
         buv.a.a.decode(uy.a, $$0.c("attack")).resultOrPartial(ae.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (buv.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         buv.a.a.decode(uy.a, $$0.c("interaction")).resultOrPartial(ae.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (buv.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.az());
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("width", this.o());
      $$0.a("height", this.q());
      if (this.k != null) {
         buv.a.a.encodeStart(uy.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         buv.a.a.encodeStart(uy.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.t());
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.j_();
      }
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public erp k_() {
      return erp.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean v(bue $$0) {
      if ($$0 instanceof com $$1) {
         this.k = new buv.a($$1.cH(), this.dX().aa());
         if ($$1 instanceof aro $$2) {
            ao.h.a($$2, this, $$1.dY().p(), 1.0F, 1.0F, false);
         }

         return !this.t();
      } else {
         return false;
      }
   }

   @Override
   public bsd a(com $$0, bsc $$1) {
      if (this.dX().C) {
         return this.t() ? bsd.a : bsd.c;
      } else {
         this.l = new buv.a($$0.cH(), this.dX().aa());
         return bsd.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bva Z_() {
      return this.k != null ? this.dX().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bva m() {
      return this.l != null ? this.dX().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.am.a(c, $$0);
   }

   private float o() {
      return this.am.a(c);
   }

   private void b(float $$0) {
      this.am.a(d, $$0);
   }

   private float q() {
      return this.am.a(d);
   }

   private void a(boolean $$0) {
      this.am.a(e, $$0);
   }

   private boolean t() {
      return this.am.a(e);
   }

   private buh v() {
      return buh.b(this.o(), this.q());
   }

   @Override
   public buh a(bvm $$0) {
      return this.v();
   }

   @Override
   protected ezi az() {
      return this.v().a(this.dv());
   }

   static record a(UUID b, long c) {
      public static final Codec<buv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kk.a.fieldOf("player").forGetter(buv.a::a), Codec.LONG.fieldOf("timestamp").forGetter(buv.a::b)).apply($$0, buv.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
