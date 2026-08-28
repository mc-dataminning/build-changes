import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bvc extends bul implements buf, bwf {
   private static final Logger a = LogUtils.getLogger();
   private static final akm<Float> b = akq.a(bvc.class, ako.d);
   private static final akm<Float> c = akq.a(bvc.class, ako.d);
   private static final akm<Boolean> d = akq.a(bvc.class, ako.k);
   private static final String e = "width";
   private static final String f = "height";
   private static final String g = "attack";
   private static final String h = "interaction";
   private static final String i = "response";
   @Nullable
   private bvc.a j;
   @Nullable
   private bvc.a k;

   public bvc(bus<?> $$0, dfm $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(b, 1.0F);
      $$0.a(c, 1.0F);
      $$0.a(d, false);
   }

   @Override
   protected void a(ul $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bvc.a.a.decode(uz.a, $$0.c("attack")).resultOrPartial(ae.a("Interaction entity", a::error)).ifPresent($$0x -> this.j = (bvc.a)$$0x.getFirst());
      } else {
         this.j = null;
      }

      if ($$0.e("interaction")) {
         bvc.a.a.decode(uz.a, $$0.c("interaction")).resultOrPartial(ae.a("Interaction entity", a::error)).ifPresent($$0x -> this.k = (bvc.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      this.a($$0.q("response"));
      this.a(this.ax());
   }

   @Override
   protected void b(ul $$0) {
      $$0.a("width", this.l());
      $$0.a("height", this.n());
      if (this.j != null) {
         bvc.a.a.encodeStart(uz.a, this.j).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.k != null) {
         bvc.a.a.encodeStart(uz.a, this.k).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.q());
   }

   @Override
   public void a(akm<?> $$0) {
      super.a($$0);
      if (c.equals($$0) || b.equals($$0)) {
         this.l_();
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
   public esa m_() {
      return esa.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean v(bul $$0) {
      if ($$0 instanceof cou $$1) {
         this.j = new bvc.a($$1.cG(), this.dV().ab());
         if ($$1 instanceof arq $$2) {
            ao.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.q();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
      return false;
   }

   @Override
   public bsk a(cou $$0, bsj $$1) {
      if (this.dV().C) {
         return this.q() ? bsk.a : bsk.c;
      } else {
         this.k = new bvc.a($$0.cG(), this.dV().ab());
         return bsk.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bvh am() {
      return this.j != null ? this.dV().b(this.j.a()) : null;
   }

   @Nullable
   @Override
   public bvh aa_() {
      return this.k != null ? this.dV().b(this.k.a()) : null;
   }

   private void a(float $$0) {
      this.al.a(b, $$0);
   }

   private float l() {
      return this.al.a(b);
   }

   private void b(float $$0) {
      this.al.a(c, $$0);
   }

   private float n() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.al.a(d, $$0);
   }

   private boolean q() {
      return this.al.a(d);
   }

   private buo s() {
      return buo.b(this.l(), this.n());
   }

   @Override
   public buo a(bvt $$0) {
      return this.s();
   }

   @Override
   protected ezt ax() {
      return this.s().a(this.dt());
   }

   static record a(UUID b, long c) {
      public static final Codec<bvc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kk.a.fieldOf("player").forGetter(bvc.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bvc.a::b)).apply($$0, bvc.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
