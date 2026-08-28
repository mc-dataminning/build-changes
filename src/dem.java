import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dem implements dek {
   final Optional<ddl> c;
   final ddl d;
   final Optional<ddl> e;
   final des f;
   @Nullable
   private ddo g;

   public dem(Optional<ddl> $$0, ddl $$1, Optional<ddl> $$2, des $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cyy a(del $$0, jg.a $$1) {
      return this.f.a($$0.d());
   }

   @Override
   public Optional<ddl> c() {
      return this.c;
   }

   @Override
   public ddl f() {
      return this.d;
   }

   @Override
   public Optional<ddl> k() {
      return this.e;
   }

   @Override
   public ddz<dem> a() {
      return ddz.t;
   }

   @Override
   public ddo ak_() {
      if (this.g == null) {
         this.g = ddo.a(List.of(this.c, Optional.of(this.d), this.e));
      }

      return this.g;
   }

   @Override
   public List<dev> g() {
      return List.of(new dfe(ddl.a(this.c), this.d.c(), ddl.a(this.e), this.f.a(), new dfb.d(czc.xw)));
   }

   public static class a implements ddz<dem> {
      private static final MapCodec<dem> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddl.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  ddl.d.fieldOf("base").forGetter($$0x -> $$0x.d),
                  ddl.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  des.a.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dem::new)
      );
      public static final yw<wj, dem> w = yw.a(ddl.b, $$0 -> $$0.c, ddl.a, $$0 -> $$0.d, ddl.b, $$0 -> $$0.e, des.b, $$0 -> $$0.f, dem::new);

      @Override
      public MapCodec<dem> a() {
         return x;
      }

      @Override
      public yw<wj, dem> b() {
         return w;
      }
   }
}
