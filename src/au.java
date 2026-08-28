import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au {
   public static final Codec<au> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwn.c.fieldOf("icon").forGetter(au::c),
               wq.a.fieldOf("title").forGetter(au::a),
               wq.a.fieldOf("description").forGetter(au::b),
               aku.a.optionalFieldOf("background").forGetter(au::d),
               ao.d.optionalFieldOf("frame", ao.a).forGetter(au::e),
               Codec.BOOL.optionalFieldOf("show_toast", true).forGetter(au::h),
               Codec.BOOL.optionalFieldOf("announce_to_chat", true).forGetter(au::i),
               Codec.BOOL.optionalFieldOf("hidden", false).forGetter(au::j)
            )
            .apply($$0, au::new)
   );
   public static final ym<vz, au> b = ym.a(au::a, au::b);
   private final wo c;
   private final wo d;
   private final cwn e;
   private final Optional<aku> f;
   private final ao g;
   private final boolean h;
   private final boolean i;
   private final boolean j;
   private float k;
   private float l;

   public au(cwn $$0, wo $$1, wo $$2, Optional<aku> $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public wo a() {
      return this.c;
   }

   public wo b() {
      return this.d;
   }

   public cwn c() {
      return this.e;
   }

   public Optional<aku> d() {
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

   private void a(vz $$0) {
      wq.d.encode($$0, this.c);
      wq.d.encode($$0, this.d);
      cwn.h.encode($$0, this.e);
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

   private static au b(vz $$0) {
      wo $$1 = wq.d.decode($$0);
      wo $$2 = wq.d.decode($$0);
      cwn $$3 = cwn.h.decode($$0);
      ao $$4 = $$0.b(ao.class);
      int $$5 = $$0.readInt();
      Optional<aku> $$6 = ($$5 & 1) != 0 ? Optional.of($$0.q()) : Optional.empty();
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      au $$9 = new au($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }
}
