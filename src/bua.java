import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bua extends btj implements btf, bvc {
   private static final Logger b = LogUtils.getLogger();
   private static final akg<Float> c = akk.a(bua.class, aki.d);
   private static final akg<Float> d = akk.a(bua.class, aki.d);
   private static final akg<Boolean> e = akk.a(bua.class, aki.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bua.a k;
   @Nullable
   private bua.a l;

   public bua(btq<?> $$0, dds $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(uf $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bua.a.a.decode(ut.a, $$0.c("attack")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bua.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bua.a.a.decode(ut.a, $$0.c("interaction")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bua.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aw());
   }

   @Override
   protected void b(uf $$0) {
      $$0.a("width", this.o());
      $$0.a("height", this.q());
      if (this.k != null) {
         bua.a.a.encodeStart(ut.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bua.a.a.encodeStart(ut.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.t());
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.i_();
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
   public eqg j_() {
      return eqg.d;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean v(btj $$0) {
      if ($$0 instanceof cnp $$1) {
         this.k = new bua.a($$1.cD(), this.dS().aa());
         if ($$1 instanceof arh $$2) {
            an.h.a($$2, this, $$1.dT().p(), 1.0F, 1.0F, false);
         }

         return !this.t();
      } else {
         return false;
      }
   }

   @Override
   public brk a(cnp $$0, brj $$1) {
      if (this.dS().B) {
         return this.t() ? brk.a : brk.c;
      } else {
         this.l = new bua.a($$0.cD(), this.dS().aa());
         return brk.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public buf X_() {
      return this.k != null ? this.dS().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public buf m() {
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

   private btm v() {
      return btm.b(this.o(), this.q());
   }

   @Override
   public btm a(bur $$0) {
      return this.v();
   }

   @Override
   protected exz aw() {
      return this.v().a(this.dq());
   }

   static record a(UUID b, long c) {
      public static final Codec<bua.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kh.a.fieldOf("player").forGetter(bua.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bua.a::b)).apply($$0, bua.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
