import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ar {
   public static final Codec<ar> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cmh.b.fieldOf("icon").forGetter(ar::c),
               vd.a.fieldOf("title").forGetter(ar::a),
               vd.a.fieldOf("description").forGetter(ar::b),
               atg.a(agt.a, "background").forGetter(ar::d),
               atg.a(al.d, "frame", al.a).forGetter(ar::e),
               atg.a(Codec.BOOL, "show_toast", true).forGetter(ar::h),
               atg.a(Codec.BOOL, "announce_to_chat", true).forGetter(ar::i),
               atg.a(Codec.BOOL, "hidden", false).forGetter(ar::j)
            )
            .apply($$0, ar::new)
   );
   private final vb b;
   private final vb c;
   private final cmh d;
   private final Optional<agt> e;
   private final al f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private float j;
   private float k;

   public ar(cmh $$0, vb $$1, vb $$2, Optional<agt> $$3, al $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public vb a() {
      return this.b;
   }

   public vb b() {
      return this.c;
   }

   public cmh c() {
      return this.d;
   }

   public Optional<agt> d() {
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

   public void a(ue $$0) {
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

   public static ar b(ue $$0) {
      vb $$1 = $$0.m();
      vb $$2 = $$0.m();
      cmh $$3 = $$0.r();
      al $$4 = $$0.b(al.class);
      int $$5 = $$0.readInt();
      Optional<agt> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.t()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      ar $$9 = new ar($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
