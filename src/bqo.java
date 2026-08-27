import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqo extends bqa implements bpx, brq {
   private static final Logger b = LogUtils.getLogger();
   private static final aja<Float> c = aje.a(bqo.class, ajc.d);
   private static final aja<Float> d = aje.a(bqo.class, ajc.d);
   private static final aja<Boolean> e = aje.a(bqo.class, ajc.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bqo.a k;
   @Nullable
   private bqo.a l;

   public bqo(bqg<?> $$0, czg $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(to $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bqo.a.a.decode(uc.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bqo.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bqo.a.a.decode(uc.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bqo.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(to $$0) {
      $$0.a("width", this.r());
      $$0.a("height", this.u());
      if (this.k != null) {
         bqo.a.a.encodeStart(uc.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bqo.a.a.encodeStart(uc.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(aja<?> $$0) {
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
   public elg k_() {
      return elg.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bqa $$0) {
      if ($$0 instanceof cka $$1) {
         this.k = new bqo.a($$1.cw(), this.dM().Y());
         if ($$1 instanceof apv $$2) {
            am.h.a($$2, this, $$1.dN().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bof a(cka $$0, boe $$1) {
      if (this.dM().B) {
         return this.v() ? bof.a : bof.b;
      } else {
         this.l = new bqo.a($$0.cw(), this.dM().Y());
         return bof.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bqt T_() {
      return this.k != null ? this.dM().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bqt p() {
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

   private float u() {
      return this.an.a(d);
   }

   private void a(boolean $$0) {
      this.an.a(e, $$0);
   }

   private boolean v() {
      return this.an.a(e);
   }

   private bqd w() {
      return bqd.b(this.r(), this.u());
   }

   @Override
   public bqd a(bre $$0) {
      return this.w();
   }

   @Override
   protected ese aq() {
      return this.w().a(this.dk());
   }

   static record a(UUID b, long c) {
      public static final Codec<bqo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jh.a.fieldOf("player").forGetter(bqo.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bqo.a::b)).apply($$0, bqo.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
