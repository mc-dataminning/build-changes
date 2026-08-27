import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bjh extends biw implements biu, bki {
   private static final Logger b = LogUtils.getLogger();
   private static final aef<Float> c = aei.a(bjh.class, aeh.d);
   private static final aef<Float> d = aei.a(bjh.class, aeh.d);
   private static final aef<Boolean> e = aei.a(bjh.class, aeh.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bjh.a k;
   @Nullable
   private bjh.a l;

   public bjh(bja<?> $$0, cqb $$1) {
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
   protected void a(qw $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bjh.a.a.decode(ri.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bjh.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bjh.a.a.decode(ri.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bjh.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.ao());
   }

   @Override
   protected void b(qw $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.t());
      if (this.k != null) {
         bjh.a.a.encodeStart(ri.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bjh.a.a.encodeStart(ri.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(aef<?> $$0) {
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
   public eal q_() {
      return eal.d;
   }

   @Override
   public boolean p_() {
      return true;
   }

   @Override
   public boolean u(biw $$0) {
      if ($$0 instanceof cca $$1) {
         this.k = new bjh.a($$1.cv(), this.dL().V());
         if ($$1 instanceof aku $$2) {
            al.g.a($$2, this, $$1.dM().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bhe a(cca $$0, bhd $$1) {
      if (this.dL().B) {
         return this.v() ? bhe.a : bhe.b;
      } else {
         this.l = new bjh.a($$0.cv(), this.dL().V());
         return bhe.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bjm S_() {
      return this.k != null ? this.dL().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bjm q() {
      return this.l != null ? this.dL().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.an.b(c, $$0);
   }

   private float s() {
      return this.an.b(c);
   }

   private void b(float $$0) {
      this.an.b(d, $$0);
   }

   private float t() {
      return this.an.b(d);
   }

   private void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   private boolean v() {
      return this.an.b(e);
   }

   private bix w() {
      return bix.b(this.s(), this.t());
   }

   @Override
   public bix a(bjy $$0) {
      return this.w();
   }

   @Override
   protected ehc ao() {
      return this.w().a(this.dj());
   }

   static record a(UUID b, long c) {
      public static final Codec<bjh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(hx.a.fieldOf("player").forGetter(bjh.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bjh.a::b)).apply($$0, bjh.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
