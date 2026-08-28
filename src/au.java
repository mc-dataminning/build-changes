import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au {
   public static final Codec<au> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwp.c.fieldOf("icon").forGetter(au::c),
               wr.a.fieldOf("title").forGetter(au::a),
               wr.a.fieldOf("description").forGetter(au::b),
               akv.a.optionalFieldOf("background").forGetter(au::d),
               ao.d.optionalFieldOf("frame", ao.a).forGetter(au::e),
               Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(au::h),
               Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(au::i),
               Codec.BOOL.optionalFieldOf("hidden", false).forGetter(au::j)
            )
            .apply($$0, au::new)
   );
   public static final yn<wa, au> b = yn.a(au::a, au::b);
   private final wp c;
   private final wp d;
   private final cwp e;
   private final Optional<akv> f;
   private final ao g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public au(cwp $$0, wp $$1, wp $$2, Optional<akv> $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public wp a() {
      return this.c;
   }

   public wp b() {
      return this.d;
   }

   public cwp c() {
      return this.e;
   }

   public Optional<akv> d() {
      return this.f;
   }

   public ao e() {
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

   private void a(wa $$0) {
      wr.d.encode($$0, this.c);
      wr.d.encode($$0, this.d);
      cwp.h.encode($$0, this.e);
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

   private static au b(wa $$0) {
      wp $$1 = wr.d.decode($$0);
      wp $$2 = wr.d.decode($$0);
      cwp $$3 = cwp.h.decode($$0);
      ao $$4 = $$0.b(ao.class);
      int $$5 = $$0.readInt();
      Optional<akv> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      au $$9 = new au($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
