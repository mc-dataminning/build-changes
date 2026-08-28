import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class fce extends fbu {
   public static final MapCodec<fce> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(faf.e.fieldOf("component").forGetter($$0x -> $$0x.b), fav.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, fce::new)
   );
   private final fae<?> b;
   private final List<fax> c;

   fce(List<fdq> $$0, fae<?> $$1, List<fax> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fbw<fce> b() {
      return fbx.t;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<czy> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(fam.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(fan $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static fce.a a(fae<?> $$0) {
      return new fce.a($$0);
   }

   public static class a extends fbu.a<fce.a> {
      private final com.google.common.collect.ImmutableList.Builder<fax> a = ImmutableList.builder();
      private final fae<?> b;

      public a(fae<?> $$0) {
         this.b = $$0;
      }

      protected fce.a a() {
         return this;
      }

      public fce.a a(fax.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fbv b() {
         return new fce(this.g(), this.b, this.a.build());
      }
   }
}
