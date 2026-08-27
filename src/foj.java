import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class foj {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fol e;

   public foj(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract foj b();

   public abstract fct a(fct var1, fon var2);

   public abstract static class a<R extends foj> {
      protected final R a;
      protected final AbuseReportLimits b;

      protected a(R $$0, AbuseReportLimits $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public R e() {
         return this.a;
      }

      public UUID f() {
         return this.a.c;
      }

      public String g() {
         return this.a.d;
      }

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public fol h() {
         return this.a.e;
      }

      public void a(fol $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract foj.b c();

      public abstract Either<foj.c, foj.b> a(fon var1);
   }

   public static record b(vd e) {
      public static final foj.b a = new foj.b(vd.c("gui.abuseReport.send.no_reason"));
      public static final foj.b b = new foj.b(vd.c("gui.chatReport.send.no_reported_messages"));
      public static final foj.b c = new foj.b(vd.c("gui.chatReport.send.too_many_messages"));
      public static final foj.b d = new foj.b(vd.c("gui.abuseReport.send.comment_too_long"));

      public eyj a() {
         return eyj.a(this.e);
      }

      public vd b() {
         return this.e;
      }
   }

   public static record c(UUID a, fom b, AbuseReport c) {
   }
}
