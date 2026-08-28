import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bth extends bsr implements bso, bum {
   private static final Logger b = LogUtils.getLogger();
   private static final ajw<Float> c = aka.a(bth.class, ajy.d);
   private static final ajw<Float> d = aka.a(bth.class, ajy.d);
   private static final ajw<Boolean> e = aka.a(bth.class, ajy.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bth.a k;
   @Nullable
   private bth.a l;

   public bth(bsx<?> $$0, dcw $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(ub $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bth.a.a.decode(up.a, $$0.c("attack")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bth.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bth.a.a.decode(up.a, $$0.c("interaction")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bth.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.au());
   }

   @Override
   protected void b(ub $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.t());
      if (this.k != null) {
         bth.a.a.encodeStart(up.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bth.a.a.encodeStart(up.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(ajw<?> $$0) {
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
   public eph j_() {
      return eph.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bsr $$0) {
      if ($$0 instanceof cmx $$1) {
         this.k = new bth.a($$1.cA(), this.dP().Z());
         if ($$1 instanceof aqv $$2) {
            an.h.a($$2, this, $$1.dQ().o(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bqr a(cmx $$0, bqq $$1) {
      if (this.dP().B) {
         return this.v() ? bqr.a : bqr.c;
      } else {
         this.l = new bth.a($$0.cA(), this.dP().Z());
         return bqr.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public btn Y_() {
      return this.k != null ? this.dP().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public btn p() {
      return this.l != null ? this.dP().b(this.l.a()) : null;
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

   private bsu w() {
      return bsu.b(this.s(), this.t());
   }

   @Override
   public bsu a(bua $$0) {
      return this.w();
   }

   @Override
   protected ewv au() {
      return this.w().a(this.dn());
   }

   static record a(UUID b, long c) {
      public static final Codec<bth.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kg.a.fieldOf("player").forGetter(bth.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bth.a::b)).apply($$0, bth.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
