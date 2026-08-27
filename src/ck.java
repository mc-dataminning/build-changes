import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ck extends dd<ck.a> {
   @Override
   public Codec<ck.a> a() {
      return ck.a.a;
   }

   public void a(aqf $$0, Collection<bql> $$1) {
      List<eoa> $$2 = Lists.newArrayList();
      Set<bqr<?>> $$3 = Sets.newHashSet();

      for (bql $$4 : $$1) {
         $$3.add($$4.ai());
         $$2.add(br.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static record a(Optional<bc> b, List<bc> c, cs.d d) implements dd.a {
      public static final Codec<ck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(br.b, "player").forGetter(ck.a::a),
                  axe.a(br.b.listOf(), "victims", List.of()).forGetter(ck.a::b),
                  axe.a(cs.d.d, "unique_entity_types", cs.d.c).forGetter(ck.a::c)
               )
               .apply($$0, ck.a::new)
      );

      public static an<ck.a> a(br.a... $$0) {
         return am.H.a(new ck.a(Optional.empty(), br.a($$0), cs.d.c));
      }

      public static an<ck.a> a(cs.d $$0) {
         return am.H.a(new ck.a(Optional.empty(), List.of(), $$0));
      }

      public boolean a(Collection<eoa> $$0, int $$1) {
         if (!this.c.isEmpty()) {
            List<eoa> $$2 = Lists.newArrayList($$0);

            for (bc $$3 : this.c) {
               boolean $$4 = false;
               Iterator<eoa> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  eoa $$6 = $$5.next();
                  if ($$3.a($$6)) {
                     $$5.remove();
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  return false;
               }
            }
         }

         return this.d.d($$1);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public List<bc> b() {
         return this.c;
      }

      public cs.d c() {
         return this.d;
      }
   }
}
