import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ar {
   public static final Codec<ar> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cng.b.fieldOf("icon").forGetter(ar::c),
               vi.a.fieldOf("title").forGetter(ar::a),
               vi.a.fieldOf("description").forGetter(ar::b),
               atx.a(ahh.a, "background").forGetter(ar::d),
               atx.a(al.d, "frame", al.a).forGetter(ar::e),
               atx.a(Codec.BOOL, "show_toast", true).forGetter(ar::h),
               atx.a(Codec.BOOL, "announce_to_chat", true).forGetter(ar::i),
               atx.a(Codec.BOOL, "hidden", false).forGetter(ar::j)
            )
            .apply($$0, ar::new)
   );
   private final vg b;
   private final vg c;
   private final cng d;
   private final Optional<ahh> e;
   private final al f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private float j;
   private float k;

   public ar(cng $$0, vg $$1, vg $$2, Optional<ahh> $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
      this.b = $$1;
      this.c = $$2;
      this.d = $$0;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public void a(float $$0, float $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public vg a() {
      return this.b;
   }

   public vg b() {
      return this.c;
   }

   public cng c() {
      return this.d;
   }

   public Optional<ahh> d() {
      return this.e;
   }

   public al e() {
      return this.f;
   }

   public float f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }

   public boolean h() {
      return this.g;
   }

   public boolean i() {
      return this.h;
   }

   public boolean j() {
      return this.i;
   }

   public void a(uj $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.f);
      int $$1 = 0;
      if (this.e.isPresent()) {
         $$1 |= 1;
      }

      if (this.g) {
         $$1 |= 2;
      }

      if (this.i) {
         $$1 |= 4;
      }

      $$0.p($$1);
      this.e.ifPresent($$0::a);
      $$0.a(this.j);
      $$0.a(this.k);
   }

   public static ar b(uj $$0) {
      vg $$1 = $$0.m();
      vg $$2 = $$0.m();
      cng $$3 = $$0.r();
      al $$4 = $$0.b(al.class);
      int $$5 = $$0.readInt();
      Optional<ahh> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.t()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      ar $$9 = new ar($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
