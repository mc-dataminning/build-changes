import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class brv extends brh implements bre, bsx {
   private static final Logger b = LogUtils.getLogger();
   private static final ajm<Float> c = ajq.a(brv.class, ajo.d);
   private static final ajm<Float> d = ajq.a(brv.class, ajo.d);
   private static final ajm<Boolean> e = ajq.a(brv.class, ajo.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private brv.a k;
   @Nullable
   private brv.a l;

   public brv(brn<?> $$0, dad $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(ajq.a $$0) {
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
         brv.a.a.decode(uo.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (brv.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         brv.a.a.decode(uo.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (brv.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("width", this.r());
      $$0.a("height", this.u());
      if (this.k != null) {
         brv.a.a.encodeStart(uo.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         brv.a.a.encodeStart(uo.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(ajm<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.aq());
      }
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   public emf k_() {
      return emf.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(brh $$0) {
      if ($$0 instanceof clh $$1) {
         this.k = new brv.a($$1.cx(), this.dN().Y());
         if ($$1 instanceof aqi $$2) {
            am.h.a($$2, this, $$1.dO().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bpm a(clh $$0, bpl $$1) {
      if (this.dN().B) {
         return this.v() ? bpm.a : bpm.b;
      } else {
         this.l = new brv.a($$0.cx(), this.dN().Y());
         return bpm.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bsa T_() {
      return this.k != null ? this.dN().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bsa p() {
      return this.l != null ? this.dN().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.ao.a(c, $$0);
   }

   private float r() {
      return this.ao.a(c);
   }

   private void b(float $$0) {
      this.ao.a(d, $$0);
   }

   private float u() {
      return this.ao.a(d);
   }

   private void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   private boolean v() {
      return this.ao.a(e);
   }

   private brk w() {
      return brk.b(this.r(), this.u());
   }

   @Override
   public brk a(bsl $$0) {
      return this.w();
   }

   @Override
   protected etk aq() {
      return this.w().a(this.dl());
   }

   static record a(UUID b, long c) {
      public static final Codec<brv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jq.a.fieldOf("player").forGetter(brv.a::a), Codec.LONG.fieldOf("timestamp").forGetter(brv.a::b)).apply($$0, brv.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
