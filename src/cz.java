import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cz extends dv<cz.a> {
   @Override
   public Codec<cz.a> a() {
      return cz.a.a;
   }

   public void a(arh $$0, Collection<btj> $$1) {
      List<est> $$2 = Lists.newArrayList();
      Set<btq<?>> $$3 = Sets.newHashSet();

      for (btj $$4 : $$1) {
         $$3.add($$4.ao());
         $$2.add(bv.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static record a(Optional<bg> b, List<bg> c, dh.d d) implements dv.a {
      public static final Codec<cz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(cz.a::a),
                  bv.b.listOf().optionalFieldOf("victims", List.of()).forGetter(cz.a::b),
                  dh.d.d.optionalFieldOf("unique_entity_types", dh.d.c).forGetter(cz.a::c)
               )
               .apply($$0, cz.a::new)
      );

      public static ao<cz.a> a(bv.a... $$0) {
         return an.H.a(new cz.a(Optional.empty(), bv.a($$0), dh.d.c));
      }

      public static ao<cz.a> a(dh.d $$0) {
         return an.H.a(new cz.a(Optional.empty(), List.of(), $$0));
      }

      public boolean a(Collection<est> $$0, int $$1) {
         if (!this.c.isEmpty()) {
            List<est> $$2 = Lists.newArrayList($$0);

            for (bg $$3 : this.c) {
               boolean $$4 = false;
               Iterator<est> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  est $$6 = $$5.next();
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
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public List<bg> b() {
         return this.c;
      }

      public dh.d c() {
         return this.d;
      }
   }
}
