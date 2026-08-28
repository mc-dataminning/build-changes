import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;

public class ezx extends eyy {
   private static final Codec<List<ezx.b>> b = ezx.b.a.listOf().validate($$0 -> {
      Set<js<buu>> $$1 = new ObjectOpenHashSet();

      for (ezx.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<ezx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ezx::new)
   );
   private final List<ezx.b> c;

   ezx(List<fau> $$0, List<ezx.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eza<ezx> b() {
      return ezb.r;
   }

   @Override
   public Set<bat<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if ($$0.a(cyc.xa) && !this.c.isEmpty()) {
         ezx.b $$2 = af.a(this.c, $$1.b());
         js<buu> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         daw.a $$5 = new daw.a($$3, $$4);
         $$0.a(kx.T, daw.a, $$5, daw::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ezx.a c() {
      return new ezx.a();
   }

   public static class a extends eyy.a<ezx.a> {
      private final Builder<ezx.b> a = ImmutableList.builder();

      protected ezx.a a() {
         return this;
      }

      public ezx.a a(js<buu> $$0, fbq $$1) {
         this.a.add(new ezx.b($$0, $$1));
         return this;
      }

      @Override
      public eyz b() {
         return new ezx(this.g(), this.a.build());
      }
   }

   static record b(js<buu> b, fbq c) {
      public static final Codec<ezx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(buu.a.fieldOf("type").forGetter(ezx.b::a), fbr.a.fieldOf("duration").forGetter(ezx.b::b)).apply($$0, ezx.b::new)
      );

      public js<buu> a() {
         return this.b;
      }

      public fbq b() {
         return this.c;
      }
   }
}
