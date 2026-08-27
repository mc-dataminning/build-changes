import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;

public class aao {
   private final BitSet a;
   private final BitSet b;
   private final BitSet c;
   private final BitSet d;
   private final List<byte[]> e;
   private final List<byte[]> f;

   public aao(csv $$0, eef $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = new BitSet();
      this.b = new BitSet();
      this.c = new BitSet();
      this.d = new BitSet();
      this.e = Lists.newArrayList();
      this.f = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$1.c(); $$4++) {
         if ($$2 == null || $$2.get($$4)) {
            this.a($$0, $$1, ctx.a, $$4, this.a, this.c, this.e);
         }

         if ($$3 == null || $$3.get($$4)) {
            this.a($$0, $$1, ctx.b, $$4, this.b, this.d, this.f);
         }
      }
   }

   public aao(ui $$0, int $$1, int $$2) {
      this.a = $$0.z();
      this.b = $$0.z();
      this.c = $$0.z();
      this.d = $$0.z();
      this.e = $$0.a((ui.a<byte[]>)($$0x -> $$0x.a(2048)));
      this.f = $$0.a((ui.a<byte[]>)($$0x -> $$0x.a(2048)));
   }

   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ui::a);
      $$0.a(this.f, ui::a);
   }

   private void a(csv $$0, eef $$1, ctx $$2, int $$3, BitSet $$4, BitSet $$5, List<byte[]> $$6) {
      dli $$7 = $$1.a($$2).a(iz.a($$0, $$1.d() + $$3));
      if ($$7 != null) {
         if ($$7.d()) {
            $$5.set($$3);
         } else {
            $$4.set($$3);
            $$6.add($$7.b().a());
         }
      }
   }

   public BitSet a() {
      return this.a;
   }

   public BitSet b() {
      return this.c;
   }

   public List<byte[]> c() {
      return this.e;
   }

   public BitSet d() {
      return this.b;
   }

   public BitSet e() {
      return this.d;
   }

   public List<byte[]> f() {
      return this.f;
   }
}
