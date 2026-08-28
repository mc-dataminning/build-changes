import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class fbe extends fau {
   public static final MapCodec<fbe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezf.e.fieldOf("component").forGetter($$0x -> $$0x.b), ezv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbe::new)
   );
   private final eze<?> b;
   private final List<ezx> c;

   fbe(List<fcq> $$0, eze<?> $$1, List<ezx> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public faw<fbe> b() {
      return fax.t;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<czd> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ezm.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(ezn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static fbe.a a(eze<?> $$0) {
      return new fbe.a($$0);
   }

   public static class a extends fau.a<fbe.a> {
      private final com.google.common.collect.ImmutableList.Builder<ezx> a = ImmutableList.builder();
      private final eze<?> b;

      public a(eze<?> $$0) {
         this.b = $$0;
      }

      protected fbe.a a() {
         return this;
      }

      public fbe.a a(ezx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fav b() {
         return new fbe(this.g(), this.b, this.a.build());
      }
   }
}
