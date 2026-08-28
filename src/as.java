import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class as {
   public static final Codec<as> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuo.d.fieldOf("icon").forGetter(as::c),
               xa.a.fieldOf("title").forGetter(as::a),
               xa.a.fieldOf("description").forGetter(as::b),
               akq.a.optionalFieldOf("background").forGetter(as::d),
               am.d.optionalFieldOf("frame", am.a).forGetter(as::e),
               Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(as::h),
               Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(as::i),
               Codec.BOOL.optionalFieldOf("hidden", false).forGetter(as::j)
            )
            .apply($$0, as::new)
   );
   public static final yw<wj, as> b = yw.a(as::a, as::b);
   private final wy c;
   private final wy d;
   private final cuo e;
   private final Optional<akq> f;
   private final am g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public as(cuo $$0, wy $$1, wy $$2, Optional<akq> $$3, am $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public wy a() {
      return this.c;
   }

   public wy b() {
      return this.d;
   }

   public cuo c() {
      return this.e;
   }

   public Optional<akq> d() {
      return this.f;
   }

   public am e() {
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

   private void a(wj $$0) {
      xa.d.encode($$0, this.c);
      xa.d.encode($$0, this.d);
      cuo.i.encode($$0, this.e);
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

      $$0.p($$1);
      this.f.ifPresent($$0::a);
      $$0.a(this.k);
      $$0.a(this.l);
   }

   private static as b(wj $$0) {
      wy $$1 = xa.d.decode($$0);
      wy $$2 = xa.d.decode($$0);
      cuo $$3 = cuo.i.decode($$0);
      am $$4 = $$0.b(am.class);
      int $$5 = $$0.readInt();
      Optional<akq> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      as $$9 = new as($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
