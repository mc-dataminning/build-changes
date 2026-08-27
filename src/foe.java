import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.List;
import java.util.function.IntSupplier;
import org.joml.Matrix4f;

public class foe implements AutoCloseable {
   private final fnq c;
   public final ejv a;
   public final ejv b;
   private final List<IntSupplier> d = Lists.newArrayList();
   private final List<String> e = Lists.newArrayList();
   private final List<Integer> f = Lists.newArrayList();
   private final List<Integer> g = Lists.newArrayList();
   private Matrix4f h;

   public foe(anw $$0, String $$1, ejv $$2, ejv $$3) throws IOException {
      this.c = new fnq($$0, $$1);
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void close() {
      this.c.close();
   }

   public final String a() {
      return this.c.h();
   }

   public void a(String $$0, IntSupplier $$1, int $$2, int $$3) {
      this.e.add(this.e.size(), $$0);
      this.d.add(this.d.size(), $$1);
      this.f.add(this.f.size(), $$2);
      this.g.add(this.g.size(), $$3);
   }

   public void a(Matrix4f $$0) {
      this.h = $$0;
   }

   public void a(float $$0) {
      this.a.e();
      float $$1 = (float)this.b.c;
      float $$2 = (float)this.b.d;
      RenderSystem.viewport(0, 0, (int)$$1, (int)$$2);
      this.c.a("DiffuseSampler", this.a::f);

      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         this.c.a(this.e.get($$3), this.d.get($$3));
         this.c.b("AuxSize" + $$3).a((float)this.f.get($$3).intValue(), (float)this.g.get($$3).intValue());
      }

      this.c.b("ProjMat").a(this.h);
      this.c.b("InSize").a((float)this.a.c, (float)this.a.d);
      this.c.b("OutSize").a($$1, $$2);
      this.c.b("Time").a($$0);
      eqp $$4 = eqp.O();
      this.c.b("ScreenSize").a((float)$$4.aM().k(), (float)$$4.aM().l());
      this.c.g();
      this.b.b(eqp.a);
      this.b.a(false);
      RenderSystem.depthFunc(519);
      ele $$5 = ell.a().c();
      $$5.a(elo.b.h, elh.m);
      $$5.a(0.0, 0.0, 500.0).e();
      $$5.a((double)$$1, 0.0, 500.0).e();
      $$5.a((double)$$1, (double)$$2, 500.0).e();
      $$5.a(0.0, (double)$$2, 500.0).e();
      elf.b($$5.d());
      RenderSystem.depthFunc(515);
      this.c.f();
      this.b.e();
      this.a.d();

      for (Object $$6 : this.d) {
         if ($$6 instanceof ejv) {
            ((ejv)$$6).d();
         }
      }
   }

   public fnq b() {
      return this.c;
   }
}
