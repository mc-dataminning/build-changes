import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bos extends bof implements bod, bpu {
   private static final Logger b = LogUtils.getLogger();
   private static final aii<Float> c = ail.a(bos.class, aik.d);
   private static final aii<Float> d = ail.a(bos.class, aik.d);
   private static final aii<Boolean> e = ail.a(bos.class, aik.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bos.a k;
   @Nullable
   private bos.a l;

   public bos(bol<?> $$0, cwe $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   protected void c_() {
      this.am.a(c, 1.0F);
      this.am.a(d, 1.0F);
      this.am.a(e, false);
   }

   @Override
   protected void a(sy $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bos.a.a.decode(tm.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bos.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bos.a.a.decode(tm.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bos.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(sy $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         bos.a.a.encodeStart(tm.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bos.a.a.encodeStart(tm.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.w());
   }

   @Override
   public void a(aii<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.aq());
      }
   }

   @Override
   public boolean bs() {
      return false;
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public ehw s_() {
      return ehw.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean t(bof $$0) {
      if ($$0 instanceof cia $$1) {
         this.k = new bos.a($$1.ct(), this.dJ().X());
         if ($$1 instanceof apb $$2) {
            am.h.a($$2, this, $$1.dK().n(), 1.0F, 1.0F, false);
         }

         return !this.w();
      } else {
         return false;
      }
   }

   @Override
   public bml a(cia $$0, bmk $$1) {
      if (this.dJ().B) {
         return this.w() ? bml.a : bml.b;
      } else {
         this.l = new bos.a($$0.ct(), this.dJ().X());
         return bml.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public box V_() {
      return this.k != null ? this.dJ().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public box q() {
      return this.l != null ? this.dJ().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.am.b(c, $$0);
   }

   private float s() {
      return this.am.b(c);
   }

   private void b(float $$0) {
      this.am.b(d, $$0);
   }

   private float u() {
      return this.am.b(d);
   }

   private void a(boolean $$0) {
      this.am.b(e, $$0);
   }

   private boolean w() {
      return this.am.b(e);
   }

   private boi x() {
      return boi.b(this.s(), this.u());
   }

   @Override
   public boi a(bpi $$0) {
      return this.x();
   }

   @Override
   protected eoq aq() {
      return this.x().a(this.dh());
   }

   static record a(UUID b, long c) {
      public static final Codec<bos.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(je.a.fieldOf("player").forGetter(bos.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bos.a::b)).apply($$0, bos.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
