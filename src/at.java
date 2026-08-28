import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at {
   public static final Codec<at> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwf.d.fieldOf("icon").forGetter(at::c),
               xn.a.fieldOf("title").forGetter(at::a),
               xn.a.fieldOf("description").forGetter(at::b),
               all.a.optionalFieldOf("background").forGetter(at::d),
               an.d.optionalFieldOf("frame", an.a).forGetter(at::e),
               Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(at::h),
               Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(at::i),
               Codec.BOOL.optionalFieldOf("hidden", false).forGetter(at::j)
            )
            .apply($$0, at::new)
   );
   public static final zj<ww, at> b = zj.a(at::a, at::b);
   private final xl c;
   private final xl d;
   private final cwf e;
   private final Optional<all> f;
   private final an g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public at(cwf $$0, xl $$1, xl $$2, Optional<all> $$3, an $$4, boolean $$5, boolean $$6, boolean $$7) {
      this.c = $$1;
      this.d = $$2;
      this.e = $$0;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
   }

   public void a(float $$0, float $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public xl a() {
      return this.c;
   }

   public xl b() {
      return this.d;
   }

   public cwf c() {
      return this.e;
   }

   public Optional<all> d() {
      return this.f;
   }

   public an e() {
      return this.g;
   }

   public float f() {
      return this.k;
   }

   public float g() {
      return this.l;
   }

   public boolean h() {
      return this.h;
   }

   public boolean i() {
      return this.i;
   }

   public boolean j() {
      return this.j;
   }

   private void a(ww $$0) {
      xn.d.encode($$0, this.c);
      xn.d.encode($$0, this.d);
      cwf.i.encode($$0, this.e);
      $$0.a(this.g);
      int $$1 = 0;
      if (this.f.isPresent()) {
         $$1 |= 1;
      }

      if (this.h) {
         $$1 |= 2;
      }

      if (this.j) {
         $$1 |= 4;
      }

      $$0.q($$1);
      this.f.ifPresent($$0::a);
      $$0.a(this.k);
      $$0.a(this.l);
   }

   private static at b(ww $$0) {
      xl $$1 = xn.d.decode($$0);
      xl $$2 = xn.d.decode($$0);
      cwf $$3 = cwf.i.decode($$0);
      an $$4 = $$0.b(an.class);
      int $$5 = $$0.readInt();
      Optional<all> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      at $$9 = new at($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
