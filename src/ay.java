import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ay extends cv<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(ana $$0, Collection<? extends blp> $$1) {
      List<egp> $$2 = $$1.stream().map($$1x -> bp.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bb> b, List<bb> c) implements cv.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(ay.a::a), atq.a(bp.b.listOf(), "victims", List.of()).forGetter(ay.a::b)).apply($$0, ay.a::new)
      );

      public static an<ay.a> a(bp.a... $$0) {
         return am.F.a(new ay.a(Optional.empty(), bp.a($$0)));
      }

      public boolean a(Collection<? extends egp> $$0) {
         for (bb $$1 : this.c) {
            boolean $$2 = false;

            for (egp $$3 : $$0) {
               if ($$1.a($$3)) {
                  $$2 = true;
                  break;
               }
            }

            if (!$$2) {
               return false;
            }
         }

         return true;
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public List<bb> b() {
         return this.c;
      }
   }
}
