import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

public class afs implements zl<abw> {
   public static final zc<wp, afs> a = zl.a(afs::a, afs::new);
   private final List<afs.a> b;

   public afs(List<afs.a> $$0) {
      this.b = $$0;
   }

   private afs(wp $$0) {
      int $$1 = $$0.readInt();
      Builder<afs.a> $$2 = ImmutableList.builder();

      for (int $$3 = 0; $$3 < $$1; $$3++) {
         $$2.add(new afs.a($$0.readInt(), afr.a.decode($$0)));
      }

      this.b = $$2.build();
   }

   private void a(wp $$0) {
      $$0.p(this.b.size());

      for (afs.a $$1 : this.b) {
         $$0.p($$1.a);
         afr.a.encode($$0, $$1.b);
      }
   }

   @Override
   public zn<afs> a() {
      return agj.aU;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public List<afs.a> b() {
      return this.b;
   }

   public static record a(int a, afr b) {
   }
}
