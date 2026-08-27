import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fkq {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fks e;

   public fkq(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fkq b();

   public abstract ezd a(ezd var1, fku var2);

   public abstract static class a<R extends fkq> {
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
      public fks h() {
         return this.a.e;
      }

      public void a(fks $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fkq.b c();

      public abstract Either<fkq.c, fkq.b> a(fku var1);
   }

   public static record b(ui e) {
      public static final fkq.b a = new fkq.b(ui.c("gui.abuseReport.send.no_reason"));
      public static final fkq.b b = new fkq.b(ui.c("gui.chatReport.send.no_reported_messages"));
      public static final fkq.b c = new fkq.b(ui.c("gui.chatReport.send.too_many_messages"));
      public static final fkq.b d = new fkq.b(ui.c("gui.abuseReport.send.comment_too_long"));

      public euu a() {
         return euu.a(this.e);
      }

      public ui b() {
         return this.e;
      }
   }

   public static record c(UUID a, fkt b, AbuseReport c) {
   }
}
