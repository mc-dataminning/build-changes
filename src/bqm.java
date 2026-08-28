import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bqm implements bpw, crf {
   private final int b;
   private final js<cua> c;
   @Nullable
   private List<bpy> d;

   public bqm(int $$0) {
      this.b = $$0;
      this.c = js.a($$0, cua.l);
   }

   public bqm(cua... $$0) {
      this.b = $$0.length;
      this.c = js.a(cua.l, $$0);
   }

   public void a(bpy $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bpy $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cua a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cua.l;
   }

   public List<cua> f() {
      List<cua> $$0 = this.c.stream().filter($$0x -> !$$0x.e()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cua a(int $$0, int $$1) {
      cua $$2 = bpx.a(this.c, $$0, $$1);
      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   public cua a(ctv $$0, int $$1) {
      cua $$2 = new cua($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cua $$4 = this.a($$3);
         if ($$4.g().equals($$0)) {
            int $$5 = $$1 - $$2.H();
            cua $$6 = $$4.a($$5);
            $$2.g($$6.H());
            if ($$2.H() == $$1) {
               break;
            }
         }
      }

      if (!$$2.e()) {
         this.e();
      }

      return $$2;
   }

   public cua b(cua $$0) {
      if ($$0.e()) {
         return cua.l;
      } else {
         cua $$1 = $$0.s();
         this.e($$1);
         if ($$1.e()) {
            return cua.l;
         } else {
            this.d($$1);
            return $$1.e() ? cua.l : $$1;
         }
      }
   }

   public boolean c(cua $$0) {
      boolean $$1 = false;

      for (cua $$2 : this.c) {
         if ($$2.e() || cua.c($$2, $$0) && $$2.H() < $$2.j()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cua b(int $$0) {
      cua $$1 = this.c.get($$0);
      if ($$1.e()) {
         return cua.l;
      } else {
         this.c.set($$0, cua.l);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cua $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean c() {
      for (cua $$0 : this.c) {
         if (!$$0.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bpy $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cmh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void a(cml $$0) {
      for (cua $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.e()).collect(Collectors.toList()).toString();
   }

   private void d(cua $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cua $$2 = this.a($$1);
         if ($$2.e()) {
            this.a($$1, $$0.f());
            return;
         }
      }
   }

   private void e(cua $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cua $$2 = this.a($$1);
         if (cua.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.e()) {
               return;
            }
         }
      }
   }

   private void a(cua $$0, cua $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.H(), $$2 - $$1.H());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(ud $$0, jl.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cua.a($$1, (uu)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public ud a(jl.a $$0) {
      ud $$1 = new ud();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cua $$3 = this.a($$2);
         if (!$$3.e()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public js<cua> g() {
      return this.c;
   }
}
