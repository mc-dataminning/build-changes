import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bpj extends bow implements bou, bql {
   private static final Logger b = LogUtils.getLogger();
   private static final aim<Float> c = aiq.a(bpj.class, aio.d);
   private static final aim<Float> d = aiq.a(bpj.class, aio.d);
   private static final aim<Boolean> e = aiq.a(bpj.class, aio.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bpj.a k;
   @Nullable
   private bpj.a l;

   public bpj(bpc<?> $$0, cwz $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(ta $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bpj.a.a.decode(to.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bpj.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bpj.a.a.decode(to.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bpj.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(ta $$0) {
      $$0.a("width", this.r());
      $$0.a("height", this.s());
      if (this.k != null) {
         bpj.a.a.encodeStart(to.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bpj.a.a.encodeStart(to.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(aim<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.aq());
      }
   }

   @Override
   public boolean bv() {
      return false;
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Override
   public eis r_() {
      return eis.d;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean u(bow $$0) {
      if ($$0 instanceof cis $$1) {
         this.k = new bpj.a($$1.cw(), this.dM().X());
         if ($$1 instanceof apg $$2) {
            am.h.a($$2, this, $$1.dN().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bnc a(cis $$0, bnb $$1) {
      if (this.dM().B) {
         return this.v() ? bnc.a : bnc.b;
      } else {
         this.l = new bpj.a($$0.cw(), this.dM().X());
         return bnc.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bpo T_() {
      return this.k != null ? this.dM().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bpo p() {
      return this.l != null ? this.dM().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.an.a(c, $$0);
   }

   private float r() {
      return this.an.a(c);
   }

   private void b(float $$0) {
      this.an.a(d, $$0);
   }

   private float s() {
      return this.an.a(d);
   }

   private void a(boolean $$0) {
      this.an.a(e, $$0);
   }

   private boolean v() {
      return this.an.a(e);
   }

   private boz w() {
      return boz.b(this.r(), this.s());
   }

   @Override
   public boz a(bpz $$0) {
      return this.w();
   }

   @Override
   protected epm aq() {
      return this.w().a(this.dk());
   }

   static record a(UUID b, long c) {
      public static final Codec<bpj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jf.a.fieldOf("player").forGetter(bpj.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bpj.a::b)).apply($$0, bpj.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
