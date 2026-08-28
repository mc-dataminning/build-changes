import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddl(dde d, dde e, jr<btb> f) implements ddo {
   public static final MapCodec<ddl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dde.b.fieldOf("min_damage").forGetter(ddl::b), dde.b.fieldOf("max_damage").forGetter(ddl::c), btb.b.fieldOf("damage_type").forGetter(ddl::d)
            )
            .apply($$0, ddl::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      float $$5 = ayy.b($$3.dZ(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bsz(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public dde b() {
      return this.d;
   }

   public dde c() {
      return this.e;
   }

   public jr<btb> d() {
      return this.f;
   }
}
