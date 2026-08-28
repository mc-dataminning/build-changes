import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class btg extends bsq implements bsn, buk {
   private static final Logger b = LogUtils.getLogger();
   private static final ajv<Float> c = ajz.a(btg.class, ajx.d);
   private static final ajv<Float> d = ajz.a(btg.class, ajx.d);
   private static final ajv<Boolean> e = ajz.a(btg.class, ajx.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private btg.a k;
   @Nullable
   private btg.a l;

   public btg(bsw<?> $$0, dcu $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(ua $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         btg.a.a.decode(uo.a, $$0.c("attack")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (btg.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         btg.a.a.decode(uo.a, $$0.c("interaction")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (btg.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.au());
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.t());
      if (this.k != null) {
         btg.a.a.encodeStart(uo.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         btg.a.a.encodeStart(uo.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(ajv<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.au());
      }
   }

   @Override
   public boolean bz() {
      return false;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   public epd j_() {
      return epd.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bsq $$0) {
      if ($$0 instanceof cmv $$1) {
         this.k = new btg.a($$1.cA(), this.dQ().Z());
         if ($$1 instanceof aqu $$2) {
            an.h.a($$2, this, $$1.dR().o(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bqq a(cmv $$0, bqp $$1) {
      if (this.dQ().B) {
         return this.v() ? bqq.a : bqq.c;
      } else {
         this.l = new btg.a($$0.cA(), this.dQ().Z());
         return bqq.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public btl T_() {
      return this.k != null ? this.dQ().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public btl p() {
      return this.l != null ? this.dQ().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.ao.a(c, $$0);
   }

   private float s() {
      return this.ao.a(c);
   }

   private void b(float $$0) {
      this.ao.a(d, $$0);
   }

   private float t() {
      return this.ao.a(d);
   }

   private void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   private boolean v() {
      return this.ao.a(e);
   }

   private bst w() {
      return bst.b(this.s(), this.t());
   }

   @Override
   public bst a(bty $$0) {
      return this.w();
   }

   @Override
   protected ewr au() {
      return this.w().a(this.do());
   }

   static record a(UUID b, long c) {
      public static final Codec<btg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kg.a.fieldOf("player").forGetter(btg.a::a), Codec.LONG.fieldOf("timestamp").forGetter(btg.a::b)).apply($$0, btg.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
