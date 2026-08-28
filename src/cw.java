import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cw extends dr<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(arc $$0, Collection<bsp> $$1) {
      List<eqd> $$2 = Lists.newArrayList();
      Set<bsv<?>> $$3 = Sets.newHashSet();

      for (bsp $$4 : $$1) {
         $$3.add($$4.ak());
         $$2.add(bu.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static record a(Optional<bf> b, List<bf> c, de.d d) implements dr.a {
      public static final Codec<cw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(cw.a::a),
                  bu.b.listOf().optionalFieldOf("victims", List.of()).forGetter(cw.a::b),
                  de.d.d.optionalFieldOf("unique_entity_types", de.d.c).forGetter(cw.a::c)
               )
               .apply($$0, cw.a::new)
      );

      public static an<cw.a> a(bu.a... $$0) {
         return am.H.a(new cw.a(Optional.empty(), bu.a($$0), de.d.c));
      }

      public static an<cw.a> a(de.d $$0) {
         return am.H.a(new cw.a(Optional.empty(), List.of(), $$0));
      }

      public boolean a(Collection<eqd> $$0, int $$1) {
         if (!this.c.isEmpty()) {
            List<eqd> $$2 = Lists.newArrayList($$0);

            for (bf $$3 : this.c) {
               boolean $$4 = false;
               Iterator<eqd> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  eqd $$6 = $$5.next();
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
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public List<bf> b() {
         return this.c;
      }

      public de.d c() {
         return this.d;
      }
   }
}
