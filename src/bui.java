import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bui extends btr implements btn, bvk {
   private static final Logger b = LogUtils.getLogger();
   private static final akh<Float> c = akl.a(bui.class, akj.d);
   private static final akh<Float> d = akl.a(bui.class, akj.d);
   private static final akh<Boolean> e = akl.a(bui.class, akj.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bui.a k;
   @Nullable
   private bui.a l;

   public bui(bty<?> $$0, dej $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(ug $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bui.a.a.decode(uu.a, $$0.c("attack")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bui.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bui.a.a.decode(uu.a, $$0.c("interaction")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bui.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aw());
   }

   @Override
   protected void b(ug $$0) {
      $$0.a("width", this.o());
      $$0.a("height", this.q());
      if (this.k != null) {
         bui.a.a.encodeStart(uu.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bui.a.a.encodeStart(uu.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.t());
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.j_();
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
   public eqy k_() {
      return eqy.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean v(btr $$0) {
      if ($$0 instanceof cnx $$1) {
         this.k = new bui.a($$1.cD(), this.dS().aa());
         if ($$1 instanceof ark $$2) {
            an.h.a($$2, this, $$1.dT().p(), 1.0F, 1.0F, false);
         }

         return !this.t();
      } else {
         return false;
      }
   }

   @Override
   public brs a(cnx $$0, brr $$1) {
      if (this.dS().B) {
         return this.t() ? brs.a : brs.c;
      } else {
         this.l = new bui.a($$0.cD(), this.dS().aa());
         return brs.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bun Y_() {
      return this.k != null ? this.dS().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bun m() {
      return this.l != null ? this.dS().b(this.l.a()) : null;
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

   private btu v() {
      return btu.b(this.o(), this.q());
   }

   @Override
   public btu a(buz $$0) {
      return this.v();
   }

   @Override
   protected eyr aw() {
      return this.v().a(this.dq());
   }

   static record a(UUID b, long c) {
      public static final Codec<bui.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ki.a.fieldOf("player").forGetter(bui.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bui.a::b)).apply($$0, bui.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
