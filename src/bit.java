import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bit extends bii implements big, bjv {
   private static final Logger b = LogUtils.getLogger();
   private static final adz<Float> c = aec.a(bit.class, aeb.d);
   private static final adz<Float> d = aec.a(bit.class, aeb.d);
   private static final adz<Boolean> e = aec.a(bit.class, aeb.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bit.a k;
   @Nullable
   private bit.a l;

   public bit(bim<?> $$0, cpm $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void a_() {
      this.an.a(c, 1.0F);
      this.an.a(d, 1.0F);
      this.an.a(e, false);
   }

   @Override
   protected void a(qr $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bit.a.a.decode(rc.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bit.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bit.a.a.decode(rc.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bit.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.ao());
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("width", this.m());
      $$0.a("height", this.o());
      if (this.k != null) {
         bit.a.a.encodeStart(rc.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bit.a.a.encodeStart(rc.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.p());
   }

   @Override
   public void a(adz<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.ao());
      }
   }

   @Override
   public boolean bq() {
      return false;
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public eai l_() {
      return eai.d;
   }

   @Override
   public boolean d_() {
      return true;
   }

   @Override
   public boolean u(bii $$0) {
      if ($$0 instanceof cbn $$1) {
         this.k = new bit.a($$1.cv(), this.dK().V());
         if ($$1 instanceof akl $$2) {
            ai.g.a($$2, this, $$1.dL().n(), 1.0F, 1.0F, false);
         }

         return !this.p();
      } else {
         return false;
      }
   }

   @Override
   public bgq a(cbn $$0, bgp $$1) {
      if (this.dK().B) {
         return this.p() ? bgq.a : bgq.b;
      } else {
         this.l = new bit.a($$0.cv(), this.dK().V());
         return bgq.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public biy M_() {
      return this.k != null ? this.dK().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public biy j() {
      return this.l != null ? this.dK().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.an.b(c, $$0);
   }

   private float m() {
      return this.an.b(c);
   }

   private void b(float $$0) {
      this.an.b(d, $$0);
   }

   private float o() {
      return this.an.b(d);
   }

   private void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   private boolean p() {
      return this.an.b(e);
   }

   private bij q() {
      return bij.b(this.m(), this.o());
   }

   @Override
   public bij a(bjk $$0) {
      return this.q();
   }

   @Override
   protected egz ao() {
      return this.q().a(this.di());
   }

   static record a(UUID b, long c) {
      public static final Codec<bit.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(hy.a.fieldOf("player").forGetter(bit.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bit.a::b)).apply($$0, bit.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
