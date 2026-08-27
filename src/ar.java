import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ar {
   public static final Codec<ar> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cmx.b.fieldOf("icon").forGetter(ar::c),
               vh.a.fieldOf("title").forGetter(ar::a),
               vh.a.fieldOf("description").forGetter(ar::b),
               atv.a(ahg.a, "background").forGetter(ar::d),
               atv.a(al.d, "frame", al.a).forGetter(ar::e),
               atv.a(Codec.BOOL, "show_toast", true).forGetter(ar::h),
               atv.a(Codec.BOOL, "announce_to_chat", true).forGetter(ar::i),
               atv.a(Codec.BOOL, "hidden", false).forGetter(ar::j)
            )
            .apply($$0, ar::new)
   );
   private final vf b;
   private final vf c;
   private final cmx d;
   private final Optional<ahg> e;
   private final al f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private float j;
   private float k;

   public ar(cmx $$0, vf $$1, vf $$2, Optional<ahg> $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public vf a() {
      return this.b;
   }

   public vf b() {
      return this.c;
   }

   public cmx c() {
      return this.d;
   }

   public Optional<ahg> d() {
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

   public void a(ui $$0) {
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

   public static ar b(ui $$0) {
      vf $$1 = $$0.m();
      vf $$2 = $$0.m();
      cmx $$3 = $$0.r();
      al $$4 = $$0.b(al.class);
      int $$5 = $$0.readInt();
      Optional<ahg> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.t()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      ar $$9 = new ar($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
