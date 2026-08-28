import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class buf extends bto implements btk, bvh {
   private static final Logger b = LogUtils.getLogger();
   private static final akg<Float> c = akk.a(buf.class, aki.d);
   private static final akg<Float> d = akk.a(buf.class, aki.d);
   private static final akg<Boolean> e = akk.a(buf.class, aki.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private buf.a k;
   @Nullable
   private buf.a l;

   public buf(btv<?> $$0, deg $$1) {
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
         buf.a.a.decode(ut.a, $$0.c("attack")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (buf.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         buf.a.a.decode(ut.a, $$0.c("interaction")).resultOrPartial(ad.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (buf.a)$$0x.getFirst());
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
         buf.a.a.encodeStart(ut.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         buf.a.a.encodeStart(ut.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
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
   public equ j_() {
      return equ.d;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean v(bto $$0) {
      if ($$0 instanceof cnu $$1) {
         this.k = new buf.a($$1.cD(), this.dS().aa());
         if ($$1 instanceof ari $$2) {
            an.h.a($$2, this, $$1.dT().p(), 1.0F, 1.0F, false);
         }

         return !this.t();
      } else {
         return false;
      }
   }

   @Override
   public brp a(cnu $$0, bro $$1) {
      if (this.dS().B) {
         return this.t() ? brp.a : brp.c;
      } else {
         this.l = new buf.a($$0.cD(), this.dS().aa());
         return brp.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public buk X_() {
      return this.k != null ? this.dS().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public buk m() {
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

   private btr v() {
      return btr.b(this.o(), this.q());
   }

   @Override
   public btr a(buw $$0) {
      return this.v();
   }

   @Override
   protected eyn aw() {
      return this.v().a(this.dq());
   }

   static record a(UUID b, long c) {
      public static final Codec<buf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kh.a.fieldOf("player").forGetter(buf.a::a), Codec.LONG.fieldOf("timestamp").forGetter(buf.a::b)).apply($$0, buf.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
