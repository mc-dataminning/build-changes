import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class den implements dek {
   final ddl c;
   final ddl d;
   final ddl e;
   final je<dhn> f;
   @Nullable
   private ddo g;

   public den(ddl $$0, ddl $$1, ddl $$2, je<dhn> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cyy a(del $$0, jg.a $$1) {
      return a($$1, $$0.d(), $$0.e(), this.f);
   }

   public static cyy a(jg.a $$0, cyy $$1, cyy $$2, je<dhn> $$3) {
      Optional<je<dhl>> $$4 = dhm.a($$0, $$2);
      if ($$4.isPresent()) {
         dhj $$5 = $$1.a(kj.W);
         dhj $$6 = new dhj($$4.get(), $$3);
         if (Objects.equals($$5, $$6)) {
            return cyy.k;
         } else {
            cyy $$7 = $$1.c(1);
            $$7.b(kj.W, $$6);
            return $$7;
         }
      } else {
         return cyy.k;
      }
   }

   @Override
   public Optional<ddl> c() {
      return Optional.of(this.c);
   }

   @Override
   public ddl f() {
      return this.d;
   }

   @Override
   public Optional<ddl> k() {
      return Optional.of(this.e);
   }

   @Override
   public ddz<den> a() {
      return ddz.u;
   }

   @Override
   public ddo ak_() {
      if (this.g == null) {
         this.g = ddo.b(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<dev> g() {
      dfb $$0 = this.d.c();
      dfb $$1 = this.e.c();
      dfb $$2 = this.c.c();
      return List.of(new dfe($$2, $$0, $$1, new dfb.g($$0, $$1, this.f), new dfb.d(czc.xw)));
   }

   public static class a implements ddz<den> {
      private static final MapCodec<den> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddl.d.fieldOf("template").forGetter($$0x -> $$0x.c),
                  ddl.d.fieldOf("base").forGetter($$0x -> $$0x.d),
                  ddl.d.fieldOf("addition").forGetter($$0x -> $$0x.e),
                  dhn.c.fieldOf("pattern").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, den::new)
      );
      public static final yw<wj, den> w = yw.a(ddl.a, $$0 -> $$0.c, ddl.a, $$0 -> $$0.d, ddl.a, $$0 -> $$0.e, dhn.d, $$0 -> $$0.f, den::new);

      @Override
      public MapCodec<den> a() {
         return x;
      }

      @Override
      public yw<wj, den> b() {
         return w;
      }
   }
}
