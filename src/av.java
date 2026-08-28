import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av {
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dak.d.fieldOf("icon").forGetter(av::c),
               xi.a.fieldOf("title").forGetter(av::a),
               xi.a.fieldOf("description").forGetter(av::b),
               ix.a.optionalFieldOf("background").forGetter(av::d),
               ap.d.optionalFieldOf("frame", ap.a).forGetter(av::e),
               Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(av::h),
               Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(av::i),
               Codec.BOOL.optionalFieldOf("hidden", false).forGetter(av::j)
            )
            .apply($$0, av::new)
   );
   public static final ze<wp, av> b = ze.a(av::a, av::b);
   private final xg c;
   private final xg d;
   private final dak e;
   private final Optional<ix> f;
   private final ap g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public av(dak $$0, xg $$1, xg $$2, Optional<ix> $$3, ap $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public xg a() {
      return this.c;
   }

   public xg b() {
      return this.d;
   }

   public dak c() {
      return this.e;
   }

   public Optional<ix> d() {
      return this.f;
   }

   public ap e() {
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

   private void a(wp $$0) {
      xi.d.encode($$0, this.c);
      xi.d.encode($$0, this.d);
      dak.j.encode($$0, this.e);
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
      this.f.map(ix::a).ifPresent($$0::a);
      $$0.a(this.k);
      $$0.a(this.l);
   }

   private static av b(wp $$0) {
      xg $$1 = xi.d.decode($$0);
      xg $$2 = xi.d.decode($$0);
      dak $$3 = dak.j.decode($$0);
      ap $$4 = $$0.b(ap.class);
      int $$5 = $$0.readInt();
      Optional<ix> $$6 = ($$5 & 1) != 0 ? Optional.of(new ix($$0.q())) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      av $$9 = new av($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
