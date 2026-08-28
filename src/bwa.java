import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bwa extends bvj implements bvd, bxd {
   private static final Logger a = LogUtils.getLogger();
   private static final alc<Float> b = alg.a(bwa.class, ale.d);
   private static final alc<Float> c = alg.a(bwa.class, ale.d);
   private static final alc<Boolean> d = alg.a(bwa.class, ale.k);
   private static final String e = "width";
   private static final String f = "height";
   private static final String g = "attack";
   private static final String h = "interaction";
   private static final String i = "response";
   @Nullable
   private bwa.a j;
   @Nullable
   private bwa.a k;

   public bwa(bvq<?> $$0, dhh $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(b, 1.0F);
      $$0.a(c, 1.0F);
      $$0.a(d, false);
   }

   @Override
   protected void a(ux $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bwa.a.a.decode(vl.a, $$0.c("attack")).resultOrPartial(ae.a("Interaction entity", a::error)).ifPresent($$0x -> this.j = (bwa.a)$$0x.getFirst());
      } else {
         this.j = null;
      }

      if ($$0.e("interaction")) {
         bwa.a.a.decode(vl.a, $$0.c("interaction")).resultOrPartial(ae.a("Interaction entity", a::error)).ifPresent($$0x -> this.k = (bwa.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      this.a($$0.q("response"));
      this.a(this.ax());
   }

   @Override
   protected void b(ux $$0) {
      $$0.a("width", this.m());
      $$0.a("height", this.p());
      if (this.j != null) {
         bwa.a.a.encodeStart(vl.a, this.j).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.k != null) {
         bwa.a.a.encodeStart(vl.a, this.k).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.s());
   }

   @Override
   public void a(alc<?> $$0) {
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
   public eub n_() {
      return eub.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public boolean v(bvj $$0) {
      if ($$0 instanceof cpw $$1) {
         this.j = new bwa.a($$1.cG(), this.dV().ac());
         if ($$1 instanceof asi $$2) {
            ao.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.s();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(ash $$0, btz $$1, float $$2) {
      return false;
   }

   @Override
   public bti a(cpw $$0, bth $$1) {
      if (this.dV().C) {
         return this.s() ? bti.a : bti.c;
      } else {
         this.k = new bwa.a($$0.cG(), this.dV().ac());
         return bti.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bwf am() {
      return this.j != null ? this.dV().b(this.j.a()) : null;
   }

   @Nullable
   @Override
   public bwf O_() {
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

   private bvm t() {
      return bvm.b(this.m(), this.p());
   }

   @Override
   public bvm a(bwr $$0) {
      return this.t();
   }

   @Override
   protected fbs ax() {
      return this.t().a(this.dt());
   }

   static record a(UUID b, long c) {
      public static final Codec<bwa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kk.a.fieldOf("player").forGetter(bwa.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bwa.a::b)).apply($$0, bwa.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
