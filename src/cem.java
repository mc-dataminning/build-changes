import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap;
import java.util.Collection;
import java.util.List;

public class cem {
   private final List<cej> a = Lists.newArrayList();
   private int b;

   public ImmutableList<cej> a() {
      return ImmutableList.copyOf(this.a);
   }

   public cem a(int $$0, float $$1) {
      this.a.add(new cej($$0, $$1));
      this.b();
      return this;
   }

   public cem a(Collection<cej> $$0) {
      this.a.addAll($$0);
      this.b();
      return this;
   }

   private void b() {
      Int2ObjectSortedMap<cej> $$0 = new Int2ObjectAVLTreeMap();
      this.a.forEach($$1 -> $$0.put($$1.a(), $$1));
      this.a.clear();
      this.a.addAll($$0.values());
      this.b = 0;
   }

   public float a(int $$0) {
      if (this.a.size() <= 0) {
         return 0.0F;
      } else {
         cej $$1 = this.a.get(this.b);
         cej $$2 = this.a.get(this.a.size() - 1);
         boolean $$3 = $$0 < $$1.a();
         int $$4 = $$3 ? 0 : this.b;
         float $$5 = $$3 ? $$2.b() : $$1.b();

         for (int $$6 = $$4; $$6 < this.a.size(); $$6++) {
            cej $$7 = this.a.get($$6);
            if ($$7.a() > $$0) {
               break;
            }

            this.b = $$6;
            $$5 = $$7.b();
         }

         return $$5;
      }
   }
}
