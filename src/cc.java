import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cc extends cv<cc.a> {
   @Override
   public Codec<cc.a> a() {
      return cc.a.a;
   }

   public void a(anf $$0, Collection<blw> $$1) {
      List<ehf> $$2 = Lists.newArrayList();
      Set<bmc<?>> $$3 = Sets.newHashSet();

      for (blw $$4 : $$1) {
         $$3.add($$4.ai());
         $$2.add(bp.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static record a(Optional<bb> b, List<bb> c, ck.d d) implements cv.a {
      public static final Codec<cc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atx.a(bp.b, "player").forGetter(cc.a::a),
                  atx.a(bp.b.listOf(), "victims", List.of()).forGetter(cc.a::b),
                  atx.a(ck.d.d, "unique_entity_types", ck.d.c).forGetter(cc.a::c)
               )
               .apply($$0, cc.a::new)
      );

      public static an<cc.a> a(bp.a... $$0) {
         return am.H.a(new cc.a(Optional.empty(), bp.a($$0), ck.d.c));
      }

      public static an<cc.a> a(ck.d $$0) {
         return am.H.a(new cc.a(Optional.empty(), List.of(), $$0));
      }

      public boolean a(Collection<ehf> $$0, int $$1) {
         if (!this.c.isEmpty()) {
            List<ehf> $$2 = Lists.newArrayList($$0);

            for (bb $$3 : this.c) {
               boolean $$4 = false;
               Iterator<ehf> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  ehf $$6 = $$5.next();
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

      public ck.d c() {
         return this.d;
      }
   }
}
