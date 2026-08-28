import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class buq extends btz implements btt, bvt {
   private static final Logger b = LogUtils.getLogger();
   private static final akk<Float> c = ako.a(buq.class, akm.d);
   private static final akk<Float> d = ako.a(buq.class, akm.d);
   private static final akk<Boolean> e = ako.a(buq.class, akm.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private buq.a k;
   @Nullable
   private buq.a l;

   public buq(bug<?> $$0, dev $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(uj $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         buq.a.a.decode(ux.a, $$0.c("attack")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (buq.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         buq.a.a.decode(ux.a, $$0.c("interaction")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (buq.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.ay());
   }

   @Override
   protected void b(uj $$0) {
      $$0.a("width", this.o());
      $$0.a("height", this.q());
      if (this.k != null) {
         buq.a.a.encodeStart(ux.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         buq.a.a.encodeStart(ux.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.t());
   }

   @Override
   public void a(akk<?> $$0) {
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
   public erj k_() {
      return erj.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean v(btz $$0) {
      if ($$0 instanceof coh $$1) {
         this.k = new buq.a($$1.cH(), this.dX().aa());
         if ($$1 instanceof arn $$2) {
            an.h.a($$2, this, $$1.dY().p(), 1.0F, 1.0F, false);
         }

         return !this.t();
      } else {
         return false;
      }
   }

   @Override
   public bry a(coh $$0, brx $$1) {
      if (this.dX().C) {
         return this.t() ? bry.a : bry.c;
      } else {
         this.l = new buq.a($$0.cH(), this.dX().aa());
         return bry.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public buv Z_() {
      return this.k != null ? this.dX().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public buv m() {
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

   private buc v() {
      return buc.b(this.o(), this.q());
   }

   @Override
   public buc a(bvh $$0) {
      return this.v();
   }

   @Override
   protected ezc ay() {
      return this.v().a(this.dv());
   }

   static record a(UUID b, long c) {
      public static final Codec<buq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kj.a.fieldOf("player").forGetter(buq.a::a), Codec.LONG.fieldOf("timestamp").forGetter(buq.a::b)).apply($$0, buq.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
